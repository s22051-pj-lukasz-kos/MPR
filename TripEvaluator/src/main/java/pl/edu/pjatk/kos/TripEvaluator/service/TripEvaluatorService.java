package pl.edu.pjatk.kos.TripEvaluator.service;

import org.springframework.stereotype.Service;
import pl.edu.pjatk.kos.TripEvaluator.model.Review;
import pl.edu.pjatk.kos.TripEvaluator.model.Trip;
import pl.edu.pjatk.kos.TripEvaluator.repository.TripRepository;

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

    public Trip addReview(Trip trip, Review review){

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


}
