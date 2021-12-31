package pl.edu.pjwstk.mpr.springboot.restjpademo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.edu.pjwstk.mpr.springboot.restjpademo.api.exceptions.PersonNotFoundException;
import pl.edu.pjwstk.mpr.springboot.restjpademo.domain.Person;
import pl.edu.pjwstk.mpr.springboot.restjpademo.service.PersonManager;

import java.util.List;

@RestController
public class PersonController {

    final PersonManager personManager;

    public PersonController(@Autowired PersonManager personManager) {
        this.personManager = personManager;
    }

    @PostMapping("/api/person")
    Person addPerson(@RequestBody Person person) { // po co ten @RequestBody
        return personManager.addPerson(person);
    }

    @GetMapping("/api/person")
    List<Person> getAll() {
        return personManager.getAllPersons();
    }

    @GetMapping("/api/person/{id}")
    Person getPerson(@PathVariable("id") String id) throws PersonNotFoundException {
        Person foundPerson = personManager.findById(id);
        if (foundPerson == null) {
            throw new PersonNotFoundException();
        }
        return foundPerson;
    }

    @DeleteMapping("/api/person/{id}")
    void deletePerson(@PathVariable("id") String id){
        personManager.deletePerson(id);
    }

    @GetMapping("/api/hello")
    String hello() {
        return "Hello!";
    }
}
