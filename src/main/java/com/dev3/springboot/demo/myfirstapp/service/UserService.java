package com.dev3.springboot.demo.myfirstapp.service;

import com.dev3.springboot.demo.myfirstapp.entityinheritance.mappedsuperclass.User;
import com.dev3.springboot.demo.myfirstapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public void saveUser(User user) {
        userRepository.save(user);
    }
}
