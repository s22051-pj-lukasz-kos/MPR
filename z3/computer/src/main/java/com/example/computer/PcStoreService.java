package com.example.computer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcStoreService {

    @Autowired
    PcStoreService pcStoreService;

    public Computer buildExampleComputer() {
        Component gpu = new Component(2, "Gigabyte", "GTX1660", 2000, 0, ComponentType.GPU);
        Component cpu = new Component(3, "AMD", "Ryzen 9 5950X", 3600, 0, ComponentType.CPU);
        Component ram = new Component(4, "Crucial", "16GB Ballistix", 400, 0, ComponentType.RAM);
        List<Component> componentList2 = List.of(gpu, ram, cpu);
        return new Computer(1, "Jakis_brand", 0.5, componentList2);
    }

    public Computer buildAnotherComputer(String name) {
        Computer comp3 = new Computer(2, name, 2.5, null);
        return comp3;
    }
}
