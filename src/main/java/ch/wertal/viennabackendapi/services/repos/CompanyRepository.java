package ch.wertal.viennabackendapi.services.repos;

import ch.wertal.viennabackendapi.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
