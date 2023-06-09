package com.example.backend.rest.controller;

import com.example.backend.rest.exception.UserDataAccessException;
import com.example.backend.rest.model.User;
import com.example.backend.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    /* Get mapping to fetch a user */
    @GetMapping(path = "/id/{id}")
    public User getUserById(@PathVariable("id") Integer userId) throws UserDataAccessException {
        return userService.findByUserId(userId);
    }

    /* Get mapping to fetch all users */
    @GetMapping(path = "/users")
    public List<User> getAllUsers() {
        List<User> users = userService.getUsers();
        return users;
    }

    /* Delete mapping to delete user by ID */
    @DeleteMapping(path = "delete/id/{id}")
    public void deleteUserByID(@PathVariable("id") Integer userId) {
        userService.deleteUserByID(userId);
    }

    /* Put mapping to update age of a specific user by ID */
    @PutMapping(path = "update/id/{id}/age/{age}")
    public void updateAgeByID(@RequestParam(name = "id") Integer userId, @RequestParam(name = "newAge") Integer newAge) {
        userService.UpdateAgeByUserID(userId, newAge);

    }
}
