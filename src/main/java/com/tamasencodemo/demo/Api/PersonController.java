package com.tamasencodemo.demo.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tamasencodemo.demo.Service.PersonService;

@RestController
@RequestMapping(path = "api/v1/person")
public class PersonController {
    
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = new PersonService();
    }

    @GetMapping
	public String getPeopleList() {
		return personService.getPeopleList();
	}

}
