package ru.kharkin.springtask.CRUDAppBoot.dao;


import ru.kharkin.springtask.CRUDAppBoot.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAll();
    void save(User user);
    User findById(int id);
    void delete(int id);
}
