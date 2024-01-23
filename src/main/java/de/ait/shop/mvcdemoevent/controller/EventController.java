package de.ait.shop.mvcdemoevent.controller;

import de.ait.shop.mvcdemoevent.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }
    @PostMapping("/register")
    public String addEvent(@RequestParam("name")String name,
                           @RequestParam("description")String description,
                           @RequestParam("date")LocalDate date){
        System.out.println(name+" "+description+" "+date);
        return null;
    }

}
