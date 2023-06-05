package com.example.backend.rest.service;

import com.example.backend.rest.repository.UserRepository;
import com.example.backend.rest.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
