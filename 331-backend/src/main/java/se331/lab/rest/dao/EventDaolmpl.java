package se331.lab.rest.dao;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import se331.lab.rest.dao.EventDao;
import se331.lab.rest.entity.Event;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EventDaolmpl implements EventDao {
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
                .petsAllowed(true)
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
                .petsAllowed(true)
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
                .petsAllowed(true)
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
                .petsAllowed(true)
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
                .petsAllowed(true)
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
                .petsAllowed(true)
                .build());
        eventList.add(Event.builder()
                .id(7L)
                .category("Animal Welfare")
                .title("Ferret Adoption Day")
                .description("Find your new mustelid friend at our adoption event!")
                .location("The Ferrethouse")
                .date("2021-08-07")
                .time("12:00")
                .organizer("The Ferrethouse")
                .petsAllowed(true)
                .build());
        eventList.add(Event.builder()
                .id(8L)
                .category("Animal Welfare")
                .title("Guinea Pig Adoption Day")
                .description("Find your new cavy friend at our adoption event!")
                .location("The Guinea Pighouse")
                .date("2021-08-07")
                .time("12:00")
                .organizer("The Guinea Pighouse")
                .petsAllowed(true)
                .build());
        eventList.add(Event.builder()
                .id(9L)
                .category("Animal Welfare")
                .title("Hamster Adoption Day")
                .description("Find your new rodent friend at our adoption event!")
                .location("The Hamsterhouse")
                .date("2021-08-07")
                .time("12:00")
                .organizer("The Hamsterhouse")
                .petsAllowed(true)
                .build());
        eventList.add(Event.builder()
                .id(10L)
                .category("Animal Welfare")
                .title("Mouse Adoption Day")
                .description("Find your new rodent friend at our adoption event!")
                .location("The Mousehouse")
                .date("2021-08-07")
                .time("12:00")
                .organizer("The Mousehouse")
                .petsAllowed(true)
                .build());
        eventList.add(Event.builder()
                .id(11L)
                .category("Animal Welfare")
                .title("Rat Adoption Day")
                .description("Find your new rodent friend at our adoption event!")
                .location("The Rathouse")
                .date("2021-08-07")
                .time("12:00")
                .organizer("The Rathouse")
                .petsAllowed(true)
                .build());
    }

    @Override
    public Integer getEventSize() {
        return eventList.size();
    }

    @Override
    public List<Event> getEvents(Integer pageSize, Integer page) {
        pageSize = pageSize == null ? eventList.size() : pageSize;
        page = page == null ? 1 : page;
        int firstIndex = (page - 1) * pageSize;
        return eventList.subList(firstIndex, firstIndex + pageSize);
    }

    @Override
    public Event getEvent(Long id) {
        return eventList.stream()
                .filter(event -> event.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}