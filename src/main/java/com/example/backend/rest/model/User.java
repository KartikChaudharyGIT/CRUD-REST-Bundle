package com.example.backend.rest.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
@Table(name = "user_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    private Integer age;
    private String location;

    @Override
    public String toString() {
        return "User [id = " + id + ",name = " + name + ", location = " + location + ",age = " + age + "]";
    }
}
