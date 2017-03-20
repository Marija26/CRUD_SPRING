package com.temaprof.app.controller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

/**
 * Created by TEMAPROF on 20.03.2017.
 */
public interface UserController {
    String getUsers(ModelMap model);

    String addUser(ModelMap model);

    String addUser(String name, String age, Boolean isAdmin);

    String deleteUser(Integer id);

    String getUpdate(Integer id, Model model);
}
