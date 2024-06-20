package com.paola.betplay.Person.infrastructure;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.Person.domain.models.Person;

public interface PersonRepository {
    void save(Person person);
    void update(Person person);
    Optional<Person> findById(int id);
    void delete(int id);
    List<Person> findAll();
}
