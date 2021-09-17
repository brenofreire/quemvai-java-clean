package com.app.quemvai.domain.entities.pool;

import java.time.LocalDate;

public class EventPoolDate {    
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate startHourDate;
    private LocalDate endHourDate;

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
}
