package pl.edu.pjatk.kos.TripEvaluator.service;

import org.springframework.stereotype.Service;
import pl.edu.pjatk.kos.TripEvaluator.model.Review;
import pl.edu.pjatk.kos.TripEvaluator.model.Trip;
import pl.edu.pjatk.kos.TripEvaluator.repository.TripRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TripEvaluatorService {

    private final TripRepository repository;

    public TripEvaluatorService(TripRepository repository) {
        this.repository = repository;
    }

    public Trip save(Trip trip) {
        return repository.save(trip);
    }

    public void addReview(Long id, Review review){
        Trip trip = findById(id);
        List<Review> reviews = trip.getReview();
        reviews.add(review);
        trip.setReview(reviews);
        repository.save(trip);
    }

    public List<Trip> findAll() {
        return repository.findAll();
    }

    public Trip findById(Long id) {
        return repository.findById(id).orElseGet(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public void addSuffixToTrip(Trip trip) {
        if (trip.getSubject() == null || trip.getSubject().isBlank()) {
            trip.setSubject("EMPTY");
        } else {
            trip.setSubject(trip.getSubject() + "_SUFFIX");
        }
    }

    public void addReviewWithoutSave(Trip trip, Review review) {
        if (trip.getReview() != null) {
            trip.getReview().add(review);
        }
    }

    public boolean isFullTrip(Trip trip) {
        return trip.getReview().size() > 10;
    }

    public void idChecker (Trip trip) {
        if (trip.getId() != null) {
            trip.setId(1L);
        }
    }

    public void validateDestination (Trip trip) {
        if (trip.getDestination().toLowerCase().equals("Radom")) {
            trip.getDestination().replace("Radom", "cokolwiek");
        }
    }

    public void validatePrice (Trip trip, Review review) {
        Long number = 50000L;
        if (trip.getCost().compareTo(number) > 0) {
            trip.getReview().add(review);
        }
    }
}
