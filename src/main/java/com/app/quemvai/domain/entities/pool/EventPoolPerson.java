package com.app.quemvai.domain.entities.pool;

public class EventPoolPerson {
    private int eventPoolIdentifier;
    private String name;
    private EventPoolStatus eventPoolStatus;
    
    public EventPoolPerson(int eventPoolIdentifier, String name, EventPoolStatus eventPoolStatus) {
        this.eventPoolIdentifier = eventPoolIdentifier;
        this.name = name;
        this.eventPoolStatus = eventPoolStatus;
    }

    public int getEventPoolIdentifier() {
        return eventPoolIdentifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventPoolStatus getEventPoolStatus() {
        return eventPoolStatus;
    }

    public void setEventPoolStatus(EventPoolStatus eventPoolStatus) {
        this.eventPoolStatus = eventPoolStatus;
    }    
}
