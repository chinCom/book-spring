package com.example.demobook.services;

import com.example.demobook.repository.BooksDemo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServices {
    private final BooksDemoService booksDedmoService;
    public BookServices(BooksDemoService booksDedmoService){
        this.booksDedmoService = booksDedmoService;
    }

    // add book
    public void add(BooksDemo book) {
        booksDedmoService.save(book);
    }

    public List<BooksDemo> getAll() {
        return booksDedmoService.findAll();
    }
}
