package de.ait.shop.mvcdemoevent.service.impl;

import de.ait.shop.mvcdemoevent.model.Event;
import de.ait.shop.mvcdemoevent.repository.EventRepository;
import de.ait.shop.mvcdemoevent.service.EventService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Event addEvent(String name, String description, LocalDate date) {
        Event event = new Event(name, description, date);
        eventRepository.save(event);
        return event;
    }

    @Override
    public List<Event> getAllEvents() {

        return eventRepository.findAll();
    }
}
