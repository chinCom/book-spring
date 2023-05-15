package com.example.demobook.controller;


import com.example.demobook.repository.BooksDemo;
import com.example.demobook.services.BooksDemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookDemoController {
    private final BooksDemoService booksDemoService;

    public BookDemoController(BooksDemoService booksDemoService) {
        this.booksDemoService = booksDemoService;
    }


    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/newbookregister")
    public String newBookRegister() {
        return "newbookregister";
    }

    @GetMapping("/availablebook")
    public String availableBook(Model model) {
        List<BooksDemo> books = booksDemoService.findAll();
        model.addAttribute("books", books);
        return "availablebook";
    }

    @PostMapping("/add")
    public String addBook(@ModelAttribute BooksDemo booksDemo) {
        booksDemoService.save(booksDemo);
        return "redirect:/books/availablebook";

    }

    @PostMapping("/update")
    public String updateBook(@ModelAttribute BooksDemo booksDemo) {
        booksDemoService.save(booksDemo);
        return "redirect:/books/availablebook";

    }

    @RequestMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") int id) {
        booksDemoService.deleteById(id);
        return "redirect:/books/availablebook";
    }
}
