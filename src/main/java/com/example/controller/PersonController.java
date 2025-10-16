package com.example.controller;

import com.example.bd.PersonRepository;
import com.example.model.Person;
import com.example.view.PersonView;

import java.util.List;

public class PersonController {
    private final PersonRepository repository;
    private final PersonView view;

    public PersonController(PersonRepository repository, PersonView view) {
        this.repository = repository;
        this.view = view;
    }

    public void addPerson(String name, int age) {
        Person created = repository.insert(new Person(name, age));
        view.showCreated(created);
    }

    public void listPeople() {
        List<Person> all = repository.findAll();
        view.showList(all);
    }
}
