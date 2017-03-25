package com.temaprof.app.controller;

import com.temaprof.app.model.User;
import com.temaprof.app.repository.UserRepository;
import com.temaprof.app.validation.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by TEMAPROF on 20.03.2017.
 */
@Controller
public class UserControllerImpl implements UserController {

    private UserRepository repository;

    private UserValidator validator;

    @Autowired
    public UserControllerImpl(UserRepository repository, UserValidator validator) {
        this.repository = repository;
        this.validator = validator;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @Override
    public String getUsers(ModelMap model) {
        List<User> users = this.repository.listAll();
        model.addAttribute("user", users);
        return "index";
    }

    @RequestMapping(value = "addUser", method = RequestMethod.GET)
    @Override
    public String addUser(ModelMap model) {
        return "addUser";
    }

    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    @Override
    public String addUser(@RequestParam("name") String name, @RequestParam("age") String age, @RequestParam(value = "isAdmin",
    required = true, defaultValue = "false") Boolean isAdmin) {
        User user = new User(name, Integer.parseInt(age), isAdmin);
        user.setCreatedDate();
        this.repository.addUser(user);
        return "redirect:/";
    }

    @RequestMapping(value = "deleteUser/{id}", method = RequestMethod.GET)
    @Override
    public String deleteUser(@PathVariable Integer id) {
        this.repository.removeUser(id);
        return "redirect:/";
    }

    @RequestMapping(value = "updateUser/{id}", method = RequestMethod.GET)
    @Override
    public String getUpdate(@PathVariable Integer id, Model model) {
        model.addAttribute("userAttribute", this.repository.get(id));
        return "updateUser";
    }

    @RequestMapping(value = "updateUser/{id}", method = RequestMethod.POST)
    @Override
    public String postUpdate(@PathVariable Integer id, Model model) {
        model.addAttribute("userAttribute", this.repository.get(id));
        return "updateUser";
    }
}
