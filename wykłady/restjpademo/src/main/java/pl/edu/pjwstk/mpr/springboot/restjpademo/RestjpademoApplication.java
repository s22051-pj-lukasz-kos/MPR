package pl.edu.pjwstk.mpr.springboot.restjpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.edu.pjwstk.mpr.springboot.restjpademo.domain.Person;
import pl.edu.pjwstk.mpr.springboot.restjpademo.service.PersonManager;

@SpringBootApplication
public class RestjpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestjpademoApplication.class, args);
	}

	@Bean
	public CommandLineRunner appSetup(@Autowired PersonManager personManager) {
		return args -> {
			System.out.println("Start CommandLineRunner");
			personManager.addPerson(new Person("Bolek", 1967));
			personManager.addPerson(new Person("Lolek", 1967));
			personManager.addPerson(new Person("Cokolwiek", 1964));
			personManager.addPerson(new Person("Tola", 1962));
		};
	}
}
