package me.dio.domain.service;

import me.dio.domain.model.User;

import java.util.UUID;

public interface IUserService {

    User findById(UUID id);

    User create(User userToCreate);

}
