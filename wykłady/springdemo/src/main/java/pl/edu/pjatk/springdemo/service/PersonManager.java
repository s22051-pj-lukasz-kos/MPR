package pl.edu.pjatk.springdemo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.edu.pjatk.springdemo.domain.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PersonManager {

    // Map<String, Person> db = new HashMap<>();
    private List<Person> db = new ArrayList<>();

    public PersonManager() {
        System.out.println("PersonManager - do dokończenia");
    }

    public Person addPerson(Person person) {
        String id = UUID.randomUUID().toString();
        Person personToAdd = new Person(id, person.getFirstName(), person.getYob());
        db.add(personToAdd);
        return personToAdd;
    }

    public List<Person> getAllPersons() {
        return db;
    }

    public boolean deletePerson(String id) {
        // TODO
        return false;
    }

}
