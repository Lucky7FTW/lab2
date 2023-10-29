package MAIN.repo;

import MAIN.domain.Ausbildung;
import MAIN.domain.AusbildungId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AusbildungRepository extends JpaRepository<Ausbildung, AusbildungId> {
}
