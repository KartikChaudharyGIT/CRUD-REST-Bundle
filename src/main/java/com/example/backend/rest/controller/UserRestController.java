package com.example.backend.rest.controller;

import com.example.backend.rest.model.User;
import com.example.backend.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1/api")
public class UserRestController {

    @Autowired
    private UserService userService;

    //CRUD Operations


    /* Post mapping to create a user */
    @PostMapping(path = "/user/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }

    /* Post mapping to create multiple users */
    @PostMapping(path = "/users/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUsers(@RequestBody Iterable<User> users) {
        userService.createUsers(users);
    }

}
