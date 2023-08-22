# DESAFIO DIO SANTANDER

Java RESTFull API.

### DIAGRAMA DE CLASSES

```mermaid
classDiagram
class User {
- name: String
- account: Account
- features: Feature[]
- card: Card
- tips: Tip[]
}

    class Account {
        - accountNumber: String
        - branchNumber: String
        - balance: Number
        - creditLimit: Number
    }

    class Card {
        - cardNumber: String
        - creditLimit: Number
    }

    class Feature {
        - icon: String
        - description: String
    }

    class Tip {
        - icon: String
        - description: String
    }

    User "1" <-- "1" Account : has
    User "1" <-- "1" Card : has
    User "1" <-- "*" Feature : has
    User "1" <-- "*" Tip : has
```