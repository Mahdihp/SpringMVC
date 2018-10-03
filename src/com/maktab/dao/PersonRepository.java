package com.maktab.dao;

import com.maktab.model.Person;
import com.maktab.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PersonRepository {



    private static Map<Long, Person> personMap = new HashMap<>();


    public void create(Person person) {
        personMap.put(person.getId(), person);
    }

    public List<Person> readAll() {
        return new ArrayList<>(personMap.values());
    }
}
