package pl.edu.pjatk.kos.PcStore.service;

import org.springframework.stereotype.Service;
import pl.edu.pjatk.kos.PcStore.model.Component;
import pl.edu.pjatk.kos.PcStore.model.ComponentType;
import pl.edu.pjatk.kos.PcStore.model.Computer;
import pl.edu.pjatk.kos.PcStore.repository.ComputerRepository;

import java.util.List;

@Service
public class PcStoreService {

    private final ComputerRepository repository;

    public PcStoreService(ComputerRepository repository) {
        this.repository = repository;
    }

    public Computer buildExampleComputer() {
        Component gpu = new Component(2L, "Gigabyte", "GTX1660", 2000, 0, ComponentType.GPU);
        Component cpu = new Component(3L, "AMD", "Ryzen 9 5950X", 3600, 0, ComponentType.CPU);
        Component ram = new Component(4L, "Crucial", "16GB Ballistix", 400, 0, ComponentType.RAM);
        return repository.save(new Computer(1L, "cokolwiek", 35.0, List.of(cpu, gpu, ram)));
    }

    public Computer buildExampleComputer(String name) {
        //Computer comp3 = new Computer(2, name, 2.5, null);
        return repository.save(new Computer(null, name, 35.0, null));
    }

    public List<Computer> getAll() {
        return repository.findAll();
    }

    public Computer findById(Long id) {
        return repository.findById(id).orElseGet(null);
    }
}
