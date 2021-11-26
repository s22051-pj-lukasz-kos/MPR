package com.example.computer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/computer")
public class ComputerRestController {

    @GetMapping("/example")
    public ResponseEntity<Computer> getExampleComputer2() {
        Component gpu = new Component(2, "Gigabyte", "GTX1660", 2000, 0, ComponentType.GPU);
        Component cpu = new Component(3, "AMD", "Ryzen 9 5950X", 3600, 0, ComponentType.CPU);
        Component ram = new Component(4, "Crucial", "16GB Ballistix", 400, 0, ComponentType.RAM);
        List<Component> componentList2 = List.of(gpu, ram, cpu);
        Computer comp2 = new Computer(1, "Jakis_brand", 0.5, componentList2);

        return ResponseEntity.ok(comp2);
    }

    @GetMapping("/example2")
    public ResponseEntity<Computer> getExampleComputer3() {
        Computer comp3 = new Computer(2, "inny_brand", 2.5, null);

        return ResponseEntity.ok(comp3);
    }

    // poczytać o @RestController, @Service
    // poczytać o wstrzykiwaniu zależności
    // poczytać o postman
}
