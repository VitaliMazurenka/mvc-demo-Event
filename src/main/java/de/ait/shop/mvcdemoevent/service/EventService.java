package de.ait.shop.mvcdemoevent.service;

import de.ait.shop.mvcdemoevent.model.Event;

import java.time.LocalDate;
import java.util.List;

public interface EventService {
    Event addEvent(String name, String description, LocalDate date);

    List<Event> getAllEvents();
}
