package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getUsers();

   User getUserByID(int id);

    void updateUser(User user);

    void deleteUser(int id);
}
