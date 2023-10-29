package MAIN.repo;

import MAIN.domain.Wachter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WachterRepository extends JpaRepository<Wachter, Long> {
    // You can add custom query methods here if needed
}