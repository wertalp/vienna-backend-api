package ch.wertal.viennabackendapi.controller;

import ch.wertal.viennabackendapi.mocks.TestData;
import ch.wertal.viennabackendapi.models.Client;
import ch.wertal.viennabackendapi.models.Company;
import ch.wertal.viennabackendapi.models.Event;
import ch.wertal.viennabackendapi.services.repos.ClientRepository;
import ch.wertal.viennabackendapi.services.repos.EventRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

        private final EventRepository eventRepository;

        public EventController(EventRepository eventRepository) {
            this.eventRepository = eventRepository;
        }

        @GetMapping
        public List<Event> getEvents() {
            return eventRepository.findAll();
        }



        @GetMapping("/{id}")
        public Event getClient(@PathVariable Long id) {
            return eventRepository.findById(id).orElseThrow(RuntimeException::new);
        }

    @PostMapping
    public ResponseEntity createEvents(@RequestBody Event event) throws URISyntaxException {
        Event savedEvent = eventRepository.save(event);
        return ResponseEntity.created(new URI("/events/" + savedEvent.getId())).body(savedEvent);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateCompany(@PathVariable Long id, @RequestBody Company company) {
        Event currentEvent = eventRepository.findById(id).orElseThrow(RuntimeException::new);
        currentEvent.setTitle (currentEvent.getTitle());
        currentEvent.setCompany  (currentEvent.getCompany());
        currentEvent = eventRepository.save(currentEvent);

        return ResponseEntity.ok(currentEvent);
    }

}
