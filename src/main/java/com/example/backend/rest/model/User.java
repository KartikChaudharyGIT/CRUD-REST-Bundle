package com.example.backend.rest.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
@Getter
@Setter
@Table(name = "user_table")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;

    @Column(name = "location")
    private String location;

    @Override
    public String toString() {
        return "User [id = " + id + ",name = " + name + ", location = " + location + ",age = " + age + "]";
    }
}
