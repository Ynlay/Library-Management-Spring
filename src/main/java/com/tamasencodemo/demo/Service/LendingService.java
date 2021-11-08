package com.tamasencodemo.demo.Service;

import com.tamasencodemo.demo.Model.Book;
import com.tamasencodemo.demo.Model.Lending;
import com.tamasencodemo.demo.Model.Person;

import org.springframework.stereotype.Service;

@Service
public class LendingService {


    // I need to have a book object and person object here

    public String getLended() {
        return new Lending(1L, 
        new Book(1L, "123", "Harper Lee", "To kill a Mockinbird", "J. B. Lippincott & Co.", "Lorem Ipsum sit dolor"),
        new Person(1L, "Jama", "Jama@mail", 30), 20).toString();
    
    }
}
