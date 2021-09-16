package com.app.quemvai.infra.models;

import java.util.Date;

import com.app.quemvai.domain.entities.pool.EventPoolRecurrence;

public class EventPoolModel {
    private int id;

    private String title;
    private String description;
    private String location;
    private boolean duringAllDay;
    private int createdBy;

    private Date startDate;
    private Date endDate;
    private Date startHourDate;
    private Date endHourDate;

    private EventPoolRecurrence recurrence;

    private Date createdAt;
    private Date updatedAt;

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartHourDate() {
        return startHourDate;
    }

    public void setStartHourDate(Date startHourDate) {
        this.startHourDate = startHourDate;
    }

    public Date getEndHourDate() {
        return endHourDate;
    }

    public void setEndHourDate(Date endHourDate) {
        this.endHourDate = endHourDate;
    }

    public EventPoolRecurrence getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(EventPoolRecurrence recurrence) {
        this.recurrence = recurrence;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getCreatedBy() {
        return createdBy;
    }
}
