package com.tamasencodemo.demo.Service;

import com.tamasencodemo.demo.Model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    
    public String getPeopleList() {
        return new Person(1L, "Jama", "Jama@mail", 30).toString();
    }
}
