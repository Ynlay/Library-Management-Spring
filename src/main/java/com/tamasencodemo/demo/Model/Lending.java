package com.tamasencodemo.demo.Model;

public class Lending {
    
    private Long id;
    private Book book;
    private Person person;
    private int daysToLend;

    public Lending(Long id, Book book, Person person, int daysToLend) {
        this.id = id;
        this.book = book;
        this.person = person;
        this.daysToLend = daysToLend;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public int getDaysToLend() {
        return daysToLend;
    }
    public void setDaysToLend(int daysToLend) {
        this.daysToLend = daysToLend;
    }
    @Override
    public String toString() {
        return "Lending [book=" + book + ", daysToLend=" + daysToLend + ", id=" + id + ", person=" + person + "]";
    }

    
}
