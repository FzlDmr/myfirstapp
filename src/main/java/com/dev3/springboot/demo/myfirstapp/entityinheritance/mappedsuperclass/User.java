package com.dev3.springboot.demo.myfirstapp.entityinheritance.mappedsuperclass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "t_user")
@Entity
public class User extends BaseEntity {

    
    private String username;

    private String password;

    //getters and setter omitted for brevity
}