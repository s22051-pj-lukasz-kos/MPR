package pl.edu.pjatk.springdemo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.pjatk.springdemo.domain.Person;
import pl.edu.pjatk.springdemo.service.PersonManager;

import java.util.List;

@RestController
public class PersonController {

    private PersonManager personManager;

    public PersonController(@Autowired PersonManager personManager) {
        this.personManager = personManager;
    }


    @PostMapping("/api/person")
    public Person addPerson(@RequestBody Person person) {
        return personManager.addPerson(person);
    }

    @GetMapping("/api/person")
    public List<Person> getPersons() {
        return personManager.getAllPersons();
    }
}
