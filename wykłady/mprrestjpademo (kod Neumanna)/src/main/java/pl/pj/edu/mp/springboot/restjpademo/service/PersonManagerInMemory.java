package pl.pj.edu.mp.springboot.restjpademo.service;

import org.springframework.stereotype.Service;
import pl.pj.edu.mp.springboot.restjpademo.domain.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Service
public class PersonManagerInMemory implements PersonManager {

  // STUB only !
  List<Person> db = new ArrayList<>();
  // List<Person> db = Collections.synchronizedList(new ArrayList<>());


  @Override
  public Person addPerson(Person person) {
    Person personToAdd = new Person(UUID.randomUUID().toString(), person.getFirstName(), person.getYob());
    db.add(personToAdd);
    return personToAdd;
  }

  @Override
  public List<Person> getAllPersons() {
    return db;
  }

  @Override
  public boolean deletePerson(String id) {
    Person personToDelete = null;
    for (Person person : db) {
      if (person.getId().equals(id)) {
        personToDelete = person;
      }
    }

    if (personToDelete != null) {
      db.remove(personToDelete);
      return true;
    }
    return false;
  }

  @Override
  public Person findById(String id) {

    Person personToFind = null;
    for (Person person : db) {
      if (person.getId().equals(id)) {
        personToFind = person;
      }
    }

    return personToFind;
  }
}
