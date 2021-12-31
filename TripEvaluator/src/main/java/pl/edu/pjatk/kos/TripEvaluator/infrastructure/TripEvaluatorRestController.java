package pl.edu.pjatk.kos.TripEvaluator.infrastructure;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.edu.pjatk.kos.TripEvaluator.model.Review;
import pl.edu.pjatk.kos.TripEvaluator.model.Trip;
import pl.edu.pjatk.kos.TripEvaluator.service.TripEvaluatorService;

import java.util.List;

@RestController
@RequestMapping("/trip")
public class TripEvaluatorRestController {
    private final TripEvaluatorService tripEvaluatorService;

    public TripEvaluatorRestController(TripEvaluatorService tripEvaluatorService) {
        this.tripEvaluatorService = tripEvaluatorService;
    }

    @GetMapping("/return")
    public ResponseEntity<List<Trip>> findAll() { return ResponseEntity.ok(tripEvaluatorService.findAll()); }

    @GetMapping
    public ResponseEntity<Trip> findById(@RequestParam Long id) { return ResponseEntity.ok(tripEvaluatorService.findById(id)); }

    @PostMapping
    public ResponseEntity<Trip> addTrip(@RequestBody Trip trip) { return ResponseEntity.ok(tripEvaluatorService.save(trip));}

    @DeleteMapping()
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTrip(@RequestParam Long id) {
        tripEvaluatorService.delete(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addReview(@RequestBody Review review, @RequestParam Long id) {
        tripEvaluatorService.addReview(id, review);
    }
}
