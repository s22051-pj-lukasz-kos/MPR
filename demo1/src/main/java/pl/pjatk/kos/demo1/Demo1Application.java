package pl.pjatk.kos.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		pismo("działa");

	}

	private static void pismo(String napis) {
		Zegarek zegarek = new Zegarek();
		System.out.println(napis);

		System.out.println("Model zegarka to " + zegarek.getNazwa());
	}



}
