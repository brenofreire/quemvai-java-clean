package com.app.quemvai.infra.models;

import java.time.LocalDate;

import com.app.quemvai.domain.entities.pool.EventPoolRecurrence;

public class EventPoolModel {
    private int id;

    private String title;
    private String description;
    private String location;
    private boolean duringAllDay;
    private int createdBy;

    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate startHourDate;
    private LocalDate endHourDate;

    private EventPoolRecurrence recurrence;

    private LocalDate createdAt;
    private LocalDate updatedAt;

    public EventPoolModel() {
        LocalDate localDate = LocalDate.now();

        this.setCreatedAt(localDate);
        this.setUpdatedAt(localDate);
    }

    public int getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isDuringAllDay() {
        return duringAllDay;
    }

    public void setDuringAllDay(boolean duringAllDay) {
        this.duringAllDay = duringAllDay;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getStartHourDate() {
        return startHourDate;
    }

    public void setStartHourDate(LocalDate startHourDate) {
        this.startHourDate = startHourDate;
    }

    public LocalDate getEndHourDate() {
        return endHourDate;
    }

    public void setEndHourDate(LocalDate endHourDate) {
        this.endHourDate = endHourDate;
    }

    public EventPoolRecurrence getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(EventPoolRecurrence recurrence) {
        this.recurrence = recurrence;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    private void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
    
    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getCreatedBy() {
        return createdBy;
    }
}
