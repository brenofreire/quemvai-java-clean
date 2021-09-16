package com.app.quemvai.domain.entities.pool;

public enum EventPoolRecurrence {    
    IS_DAILLY("daily"),
    IS_WEEKLY("weekly"),
    IS_MONTHLY("monthly"),
    IS_ANNUALLY("annually");

    public final String label;

    EventPoolRecurrence(String recurrence) {
        this.label = recurrence;
    }
}
