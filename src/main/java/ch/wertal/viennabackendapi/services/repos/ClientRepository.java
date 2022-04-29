package ch.wertal.viennabackendapi.services.repos;


import ch.wertal.viennabackendapi.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    }

