package pl.pj.edu.mp.springboot.restjpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.pj.edu.mp.springboot.restjpademo.domain.Person;
import pl.pj.edu.mp.springboot.restjpademo.service.PersonManager;

@SpringBootApplication
public class RestjpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestjpademoApplication.class, args);
	}

	@Bean
	public CommandLineRunner appSetup(@Autowired PersonManager personManager) {

		return args -> {
			System.out.println("Startuje CommandLineRunner....");
			personManager.addPerson(new Person("Bolek", 1967));
			personManager.addPerson(new Person("Lolek", 1967));
			personManager.addPerson(new Person("Tola", 1963));
			personManager.addPerson(new Person("Reksio", 1957));
		};
	}
}
