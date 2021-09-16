package com.app.quemvai.domain.entities.pool;

public class EventPool {
    private int identifier;

    private String title;
    private String description;
    private String location;    
    private boolean duringAllDay;

    private EventPoolDate date; 
    private EventPoolRecurrence recurrence;
 
    public EventPool(String title, EventPoolDate eventPoolDate, EventPoolRecurrence eventPoolRecurrence) {
        this.title = title;
        this.date = eventPoolDate;
        this.recurrence = eventPoolRecurrence;
        this.identifier = this.title.hashCode();
    }

    public EventPool(String title, EventPoolDate eventPoolDate) {
        this.title = title;
        this.date = eventPoolDate;
    }

    public EventPoolDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public EventPoolRecurrence getRecurrence() {
        return recurrence;
    }

    public String getTitle() {
        return title;
    }

    public boolean getDuringAllDay() {
        return this.duringAllDay;
    }
    
    public int getIdentifier() {
        return identifier;
    }
}
