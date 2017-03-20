package com.temaprof.app.repository;

import com.temaprof.app.model.User;

import java.util.List;

/**
 * Created by TEMAPROF on 20.03.2017.
 */
public interface UserRepository {
    void addUser(User user);

    User get(Integer id);

    List<User> listAll();

    void removeUser(Integer id);

    void updateUser(User user);
}
