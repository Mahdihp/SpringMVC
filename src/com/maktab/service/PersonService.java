package com.maktab.service;


import com.maktab.dao.PersonRepository;
import com.maktab.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

   private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void save(Person person) {
            personRepository.create(person);
    }

    public List<Person> readAll() {
        return personRepository.readAll();
    }

}
