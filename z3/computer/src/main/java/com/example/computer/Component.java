package com.example.computer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Component {
    @Id
    private Integer id;
    private String brand;
    private String model;
    private double price;
    private int power;
    public ComponentType componentType;

    public Component() {
    }

    public Component(Integer id, String brand, String model, double price, int power, ComponentType componentType) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.power = power;
        this.componentType = componentType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public ComponentType getComponentType() {
        return componentType;
    }

    public void setComponentType(ComponentType componentType) {
        this.componentType = componentType;
    }

    @Override
    public String toString() {
        return "Component{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", power=" + power +
                ", componentType=" + componentType +
                '}';
    }
}
