package pl.edu.pjatk.kos.TripEvaluator.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subject;
    private String destination;
    private Long cost;
    @OneToMany
    private List<Review> review;

    public Trip(Long id, String subject, String destination, Long cost, List<Review> review) {
        this.id = id;
        this.subject = subject;
        this.destination = destination;
        this.cost = cost;
        this.review = review;
    }

    public Trip() {
    }

    public Long  getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public List<Review> getReview() {
        return review;
    }

    public void setReview(List<Review> review) {
        this.review = review;
    }
}