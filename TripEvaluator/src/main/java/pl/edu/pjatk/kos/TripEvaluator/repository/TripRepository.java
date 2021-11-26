package pl.edu.pjatk.kos.TripEvaluator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.pjatk.kos.TripEvaluator.model.Trip;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {

}
