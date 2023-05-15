package com.example.demobook.services;


import com.example.demobook.repository.BooksDemo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksDemoService extends JpaRepository<BooksDemo, Integer> {
}
