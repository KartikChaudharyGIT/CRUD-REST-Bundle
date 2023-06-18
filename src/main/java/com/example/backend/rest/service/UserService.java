package com.example.backend.rest.service;

import com.example.backend.rest.exception.UserDataAccessException;
import com.example.backend.rest.repository.UserRepository;
import com.example.backend.rest.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void createUser(User user) {
        userRepository.save(user);
        log.info("User has been saved!");
    }

    public void createUsers(Iterable<User> userList) {
        userRepository.saveAll(userList);
        log.info("Users have been saved!");
    }

    public User findByUserId(Integer userId) throws UserDataAccessException {
        log.info("Searching for the user.");
        if (userId == null) {
            throw new UserDataAccessException("User Id cannot be null");
        }
        Optional<User> findById = userRepository.findById(userId);
        if (findById.isPresent())
            return findById.get();
        throw new UserDataAccessException("User with ID = " + userId + " not found in Database");
    }

    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }
}

