package ch.wertal.viennabackendapi.services.repos;

import ch.wertal.viennabackendapi.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
