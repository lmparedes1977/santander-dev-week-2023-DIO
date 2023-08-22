package me.dio.domain.service.impl;

import me.dio.domain.model.User;
import me.dio.repository.UserRepository;
import me.dio.domain.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class UserService implements IUserService {

    private final UserRepository _userRepository;

    public UserService(UserRepository userRepository){
        this._userRepository = userRepository;
    }

    @Override
    public User findById(UUID id) {
        return this._userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (_userRepository.existsByAccountAccountNumber(userToCreate.getAccount().getAccountNumber())) {
            throw new IllegalArgumentException("User already exists");
        }

        return this._userRepository.save(userToCreate);
    }
}
