package ManageObject;

import AppObject.Event;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ManageEvent {

    private List<Event> events = new ArrayList<>();

    // Thêm một sự kiện mới
    public void addEvent(Event event) {
        events.add(event);
    }

    // Sắp xếp danh sách sự kiện theo tên
    public List<Event> sortEventsByName() {
        Collections.sort(events, new Comparator<Event>() {
            @Override
            public int compare(Event event1, Event event2) {
                return event1.getEvent_title().compareTo(event2.getEvent_title());
            }
        });
        return events;
    }

    // Sắp xếp danh sách sự kiện theo ngày bắt đầu
    public List<Event> sortEventsByStartDate() {
        Collections.sort(events, new Comparator<Event>() {
            @Override
            public int compare(Event event1, Event event2) {
                return event1.getStart_time().compareTo(event2.getStart_time());
            }
        });
        return events;
    }

    // Tạo một sự kiện mới
    public Event createEvent(int event_id, String event_title, String event_description, Date start_time, Date end_time, Date reminder_time, String event_location) {
        Event event = new Event();
        event.setEvent_id(event_id);
        event.setEvent_title(event_title);
        event.setEvent_description(event_description);
        event.setStart_time(start_time);
        event.setEnd_time(end_time);
        event.setReminder_time(reminder_time);
        event.setEvent_location(event_location);
        return event;
    }

}
