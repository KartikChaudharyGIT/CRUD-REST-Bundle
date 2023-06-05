package com.example.backend.rest.repository;

import com.example.backend.rest.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
