package pl.edu.pjatk.kos.TripEvaluator.infrastructure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.edu.pjatk.kos.TripEvaluator.model.Trip;
import pl.edu.pjatk.kos.TripEvaluator.service.TripEvaluatorService;

@RestController
@RequestMapping("/trip")
public class TripEvaluatorRestController {
    private TripEvaluatorService tripEvaluatorService;

    public TripEvaluatorRestController(TripEvaluatorService tripEvaluatorService) {
        this.tripEvaluatorService = tripEvaluatorService;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Trip> delete(Long id) {
        tripEvaluatorService.delete(id);
        return ResponseEntity.
    }

}
