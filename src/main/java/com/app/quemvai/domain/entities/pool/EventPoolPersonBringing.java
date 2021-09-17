package com.app.quemvai.domain.entities.pool;

public class EventPoolPersonBringing {
    private String bringing;
    private int quantity;
    private String disclaimer;

    public EventPoolPersonBringing(String bringing, int quantity, String disclaimer) {
        this.bringing = bringing;
        this.quantity = quantity;
        this.disclaimer = disclaimer;
    }
    
    public String getBringing() {
        return bringing;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public int getQuantity() {
        return quantity;
    }
}