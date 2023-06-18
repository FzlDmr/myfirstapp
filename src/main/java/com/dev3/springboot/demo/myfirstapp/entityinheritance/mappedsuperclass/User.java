package com.dev3.springboot.demo.myfirstapp.entityinheritance.mappedsuperclass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


@Entity
public
class User extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String username;

    private String password;

    //getters and setter omitted for brevity
}