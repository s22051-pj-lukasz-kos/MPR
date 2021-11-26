package com.example.computer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/computer")
public class ComputerRestController {
    private PcStoreService pcStoreService;

    public ComputerRestController(PcStoreService pcStoreService) {
        this.pcStoreService = pcStoreService;
    }

    @GetMapping("/example")
    public ResponseEntity<Computer> getExampleComputer2() {
        return ResponseEntity.ok(pcStoreService.buildExampleComputer());
    }

    @GetMapping("/example2")
    public ResponseEntity<Computer> getExampleComputer3() {
        return ResponseEntity.ok(pcStoreService.buildAnotherComputer("Predator"));
    }

    // poczytać o @RestController, @Service
    // poczytać o wstrzykiwaniu zależności
    // poczytać o postman
    //co to jest @Repository
    // jak dodac @repository
    // jak dodac cos do bazy danych
    // jak odczytywac z bazy danych
}
