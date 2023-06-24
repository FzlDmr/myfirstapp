package com.dev3.springboot.demo.myfirstapp.repository;

import com.dev3.springboot.demo.myfirstapp.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
