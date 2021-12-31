package pl.edu.pjwstk.mpr.springboot.restjpademo.service;

import pl.edu.pjwstk.mpr.springboot.restjpademo.domain.Person;

import java.util.List;

public interface PersonManager {
    Person addPerson(Person person);
    List<Person> getAllPersons();
    boolean deletePerson(String id);
    Person findById(String id);
}
