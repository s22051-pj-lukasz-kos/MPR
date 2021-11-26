package pl.edu.pjatk.kos.PcStore.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double commission;
    @OneToMany
    private List<Component> components;

    public Computer(Long id, String name, double commission, List<Component> components) {
        this.id = id;
        this.name = name;
        this.commission = commission;
        this.components = components;
    }

    public Computer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", commission=" + commission +
                ", components=" + components +
                '}';
    }
}
