package MAIN.repo;

import MAIN.domain.AusbildungsInstitut;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AusbildungsInstitutRepository extends JpaRepository<AusbildungsInstitut, Long> {
}
