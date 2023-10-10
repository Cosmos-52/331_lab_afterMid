package se331.lab.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import se331.lab.rest.entity.Event;

import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Controller
public class EventController {
    List<Event> eventList;

    @PostConstruct
    public void init() {
        eventList = new ArrayList<>();
        eventList.add(Event.builder()
                .id(1L)
                .category("Animal Welfare")
                .title("Cat Adoption Day")
                .description("Find your new feline friend at our adoption event!")
                .location("The Cathouse")
                .date("2021-08-07")
                .time("12:00")
                .organizer("The Cathouse")
                .petAllowed(true)
                .build());
        eventList.add(Event.builder()
                .id(2L)
                .category("Animal Welfare")
                .title("Dog Adoption Day")
                .description("Find your new canine friend at our adoption event!")
                .location("The Doghouse")
                .date("2021-08-07")
                .time("12:00")
                .organizer("The Doghouse")
                .petAllowed(true)
                .build());
        eventList.add(Event.builder()
                .id(3L)
                .category("Animal Welfare")
                .title("Rabbit Adoption Day")
                .description("Find your new lagomorph friend at our adoption event!")
                .location("The Bunnery")
                .date("2021-08-07")
                .time("12:00")
                .organizer("The Bunnery")
                .petAllowed(true)
                .build());
        eventList.add(Event.builder()
                .id(4L)
                .category("Animal Welfare")
                .title("Bird Adoption Day")
                .description("Find your new avian friend at our adoption event!")
                .location("The Birdhouse")
                .date("2021-08-07")
                .time("12:00")
                .organizer("The Birdhouse")
                .petAllowed(true)
                .build());
        eventList.add(Event.builder()
                .id(5L)
                .category("Animal Welfare")
                .title("Snake Adoption Day")
                .description("Find your new reptilian friend at our adoption event!")
                .location("The Snakehouse")
                .date("2021-08-07")
                .time("12:00")
                .organizer("The Snakehouse")
                .petAllowed(true)
                .build());
        eventList.add(Event.builder()
                .id(6L)
                .category("Animal Welfare")
                .title("Turtle Adoption Day")
                .description("Find your new reptilian friend at our adoption event!")
                .location("The Turtlehouse")
                .date("2021-08-07")
                .time("12:00")
                .organizer("The Turtlehouse")
                .petAllowed(true)
                .build());
    }
    @GetMapping("events")
    public ResponseEntity<?> getEventLists(@RequestParam(value = "_limit", required = false) Integer perPage
            ,@RequestParam(value = "_page", required = false)Integer page) {
        perPage = perPage == null ? eventList.size() : perPage;
        page = page == null ? 1 : page;
        Integer firstIndex = (page - 1) * perPage;
        List<Event> output = new ArrayList<>();
        for (int i = firstIndex; i < firstIndex + perPage ; i++) {
            output.add(eventList.get(i));
        }
        return ResponseEntity.ok(output);
    }
}