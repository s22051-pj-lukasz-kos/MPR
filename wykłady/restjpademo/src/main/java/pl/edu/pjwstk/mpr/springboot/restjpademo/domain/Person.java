package pl.edu.pjwstk.mpr.springboot.restjpademo.domain;

import java.util.Objects;

public class Person {
    private String id;
    private String firstName;
    private int yob;

    public Person() {
    }

    public Person(String id, String firstName, int yob) {
        this.id = id;
        this.firstName = firstName;
        this.yob = yob;
    }

    public String getId() {
        return id;
    }

    public Person(String firstName, int yob) {
        this.firstName = firstName;
        this.yob = yob;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", yob=" + yob +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return yob == person.yob && Objects.equals(id, person.id) && Objects.equals(firstName, person.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, yob);
    }
}
