package pl.edu.pjatk.kos.PcStore.infrastructure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.pjatk.kos.PcStore.model.Computer;
import pl.edu.pjatk.kos.PcStore.service.PcStoreService;

import java.util.List;

@RestController
@RequestMapping("/computer")
public class ComputerRestController {

    private PcStoreService pcStoreService;

    public ComputerRestController(PcStoreService pcStoreService) {
        this.pcStoreService = pcStoreService;
    }

    @GetMapping("/example")
    public ResponseEntity<Computer> getExampleComputer() {
        return ResponseEntity.ok(pcStoreService.buildExampleComputer());
    }

    @GetMapping("/example2")
    public ResponseEntity<Computer> getExampleComputer2() {
        return ResponseEntity.ok(pcStoreService.buildExampleComputer("Predator"));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Computer>> getAll() {
        return ResponseEntity.ok(pcStoreService.getAll());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Computer> getById(@PathVariable Long id) {
        return ResponseEntity.ok(pcStoreService.findById(id));
    }
}
