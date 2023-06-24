package com.dev3.springboot.demo.myfirstapp.controller;

import com.dev3.springboot.demo.myfirstapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.dev3.springboot.demo.myfirstapp.entityinheritance.mappedsuperclass.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<Map<String,String>> saveUser(@RequestBody User user){
        userService.saveUser(user);

        Map<String,String> response = new HashMap<>();
        response.put("success","User is saved successfully");
        response.put("status","success");

        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }


}
