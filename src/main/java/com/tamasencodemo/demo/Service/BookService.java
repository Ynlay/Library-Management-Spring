package com.tamasencodemo.demo.Service;
import com.tamasencodemo.demo.Model.Book;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    public String getBooks() {
        return new Book(1L, "123", "Harper Lee", "To kill a Mockinbird", "J. B. Lippincott & Co.", "Lorem Ipsum sit dolor").toString();
    }
}
