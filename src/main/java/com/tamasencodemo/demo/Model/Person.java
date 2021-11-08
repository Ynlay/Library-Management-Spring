package com.tamasencodemo.demo.Model;

public class Person {
    private Long id;
    private String name;
    private String email;
    private int age;

    public Person(Long id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Long GetID() {
        return id;
    }

    public String GetName() {
        return name;
    }

    public String GetEmail() {
        return email;
    }

    public int GetAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", email=" + email + ", id=" + id + ", name=" + name + "]";
    }
}
