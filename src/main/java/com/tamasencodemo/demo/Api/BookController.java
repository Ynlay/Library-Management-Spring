package com.tamasencodemo.demo.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tamasencodemo.demo.Service.BookService;

@RestController
@RequestMapping(path = "api/v1/book")
public class BookController {
    
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public String getBooks() {
        return bookService.getBooks();
    }
}
