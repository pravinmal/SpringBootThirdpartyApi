package org.sb3rdpartyapi.controller;


import org.sb3rdpartyapi.entity.User;
import org.sb3rdpartyapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/save-users")
    public List<User> saveUsers() {
        return userService.fetchAndSaveUsers();
    }
}
