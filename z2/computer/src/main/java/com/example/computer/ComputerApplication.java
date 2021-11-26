package com.example.computer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ComputerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputerApplication.class, args);

		// jeden sposob
		ArrayList<Component> componentList1 = new ArrayList<>();
		componentList1.add(new Component(2, "Gigabyte", "GTX1660", 2000, 0, ComponentType.GPU));
		componentList1.add(new Component(3, "AMD", "Ryzen 9 5950X", 3600, 0, ComponentType.CPU));
		componentList1.add(new Component(4, "Crucial", "16GB Ballistix", 400, 0, ComponentType.RAM));
		Computer comp1 = new Computer(1, "Jakis_brand", 0.05, componentList1);

		System.out.println(comp1);


	}

}
