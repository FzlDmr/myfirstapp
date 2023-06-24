package com.dev3.springboot.demo.myfirstapp.repository;

import com.dev3.springboot.demo.myfirstapp.entityinheritance.mappedsuperclass.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
