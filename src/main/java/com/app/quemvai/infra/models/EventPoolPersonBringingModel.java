package com.app.quemvai.infra.models;

import java.time.LocalDate;

import com.app.quemvai.domain.entities.pool.EventPoolPersonBringing;

public class EventPoolPersonBringingModel {
    private int id;
    private int idEventPool;
    private int idUserAccount;
    
    private String bringing;
    private int quantity;
    private String disclaimer;

    private LocalDate createdAt;
    private LocalDate updateAt;

    public EventPoolPersonBringingModel(EventPoolPersonModel eventPoolPersonModel, EventPoolPersonBringing eventPoolPersonBringing) {
        this.idEventPool = eventPoolPersonModel.getIdEventPool();
        this.idUserAccount = eventPoolPersonModel.getIdUserAccount();

        this.bringing = eventPoolPersonBringing.getBringing();
        this.quantity = eventPoolPersonBringing.getQuantity();
        this.disclaimer = eventPoolPersonBringing.getDisclaimer();

        LocalDate now = LocalDate.now();

        this.setCreatedAt(now);
        this.setUpdateAt(now);
    }

    public int getId() {
        return id;
    }
    
    public LocalDate getCreatedAt() {
        return createdAt;
    }
    
    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDate updateAt) {
        this.updateAt = updateAt;
    }

    public String getBringing() {
        return bringing;
    }

    public int getIdEventPool() {
        return idEventPool;
    }

    public int getIdUserAccount() {
        return idUserAccount;
    }
    
    public String getDisclaimer() {
        return disclaimer;
    }

    public int getQuantity() {
        return quantity;
    }
}
