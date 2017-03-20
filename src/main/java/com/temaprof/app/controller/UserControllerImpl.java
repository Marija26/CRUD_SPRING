package com.temaprof.app.controller;

import com.temaprof.app.repository.UserRepository;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

/**
 * Created by TEMAPROF on 20.03.2017.
 */
public class UserControllerImpl implements UserController{
    private UserRepository repository;

    @Override
    public String getUsers(ModelMap model) {
        return null;
    }

    @Override
    public String addUser(ModelMap model) {
        return null;
    }

    @Override
    public String addUser(String name, String age,  Boolean isAdmin) {
        return null;
    }

    @Override
    public String deleteUser(Integer id) {
        return null;
    }

    @Override
    public String getUpdate(Integer id, Model model) {
        return null;
    }
}
