package de.ait.shop.mvcdemoevent.repository;

import de.ait.shop.mvcdemoevent.model.Event;

public interface EventRepository extends CrudRepository<Event> {
    Event findByName(String name);

}
