package com.app.quemvai.domain.entities.pool;

import java.sql.Date;

public class EventPoolDate {    
    private Date startDate;
    private Date endDate;
    private Date startHourDate;
    private Date endHourDate;

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
}
