package com.tamasencodemo.demo.Model;

public class Book {
    private Long id;
    private String isbn;
    private String author;
    private String name;
    private String publisher;
    private String description;

    public Book(Long id, String isbn, String author, String name, String publisher, String description) {
        this.id = id;
        this.isbn = isbn;
        this.author = author;
        this.name = name;
        this.publisher = publisher;
        this.description = description;
    }

    
    public Book(Long id, String isbn, String author, String name, String publisher) {
        this.id = id;
        this.isbn = isbn;
        this.author = author;
        this.name = name;
        this.publisher = publisher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", description=" + description + ", id=" + id + ", isbn=" + isbn + ", name="
                + name + ", publisher=" + publisher + "]";
    }
}
