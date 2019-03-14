package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private int id;

    private String name;

    private int age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User() {

    }

    public static User build(String name, Integer age) {
        User u = new User();
        u.age = age;
        u.name = name;
        return u;
    }
}
