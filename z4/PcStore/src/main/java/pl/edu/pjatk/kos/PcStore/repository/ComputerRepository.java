package pl.edu.pjatk.kos.PcStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.pjatk.kos.PcStore.model.Computer;

@Repository
public interface ComputerRepository extends JpaRepository<Computer, Long> {
}
