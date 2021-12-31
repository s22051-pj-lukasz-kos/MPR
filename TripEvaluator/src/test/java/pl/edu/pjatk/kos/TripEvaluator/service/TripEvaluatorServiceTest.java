package pl.edu.pjatk.kos.TripEvaluator.service;

import org.junit.jupiter.api.Test;
import pl.edu.pjatk.kos.TripEvaluator.model.Review;
import pl.edu.pjatk.kos.TripEvaluator.model.Trip;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TripEvaluatorServiceTest {
    // Utworzyć obiekt serwisu
    private TripEvaluatorService tripEvaluatorService = new TripEvaluatorService(null);

    @Test
    void shouldAddSuffixToTrip() {
        // given
        Trip trip = new Trip(null, "TITLE", "test dest", null, List.of());
        // when
        tripEvaluatorService.addSuffixToTrip(trip);
        // then
        assertThat(trip.getSubject()).isEqualTo("TITLE_SUFFIX");
    }

    @Test
    void shouldAddBlankTitleToTrip_null() {
        // given
        Trip trip = new Trip(null, null, "test dest", null, List.of());
        // when
        tripEvaluatorService.addSuffixToTrip(trip);
        // then
        assertThat(trip.getSubject()).isEqualTo("EMPTY");
    }

    @Test
    void shouldAddBlankTitleToTrip_blankString() {
        // given
        Trip trip = new Trip(null, "", "test dest", null, List.of());
        // when
        tripEvaluatorService.addSuffixToTrip(trip);
        // then
        assertThat(trip.getSubject()).isEqualTo("EMPTY");
    }

    void addReviewWithoutSave() {
        // given
        Trip trip = new Trip(null, "TITLE", "test dest", null, List.of());
        Review review = new Review(null, "", null, null);
        // when

        // then
    }
}
