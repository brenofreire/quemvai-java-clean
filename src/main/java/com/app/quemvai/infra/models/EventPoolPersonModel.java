package com.app.quemvai.infra.models;

import java.time.LocalDate;

import com.app.quemvai.domain.entities.pool.EventPoolStatus;

public class EventPoolPersonModel {
    private int id;
    private int idEventPool;
    private int idUserAccount;
    private EventPoolStatus status;
    private String personName;

    private LocalDate createdAt;
    private LocalDate updateAt;

    public EventPoolPersonModel(EventPoolStatus status, int idEventPool) {
        LocalDate now = LocalDate.now();

        this.idEventPool = idEventPool;

        this.setStatus(status);;
        this.setCreatedAt(now);
        this.setUpdateAt(now);
    }


    public int getId() {
        return id;
    }

    public int getIdEventPool() {
        return idEventPool;
    }

    public void setIdEventPool(int idEventPool) {
        this.idEventPool = idEventPool;
    }

    public int getIdUserAccount() {
        return idUserAccount;
    }

    public void setIdUserAccount(int idUserAccount) {
        this.idUserAccount = idUserAccount;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    private void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDate updateAt) {
        this.updateAt = updateAt;
    }

    public void setStatus(EventPoolStatus status) {
        this.status = status;
    }

    public EventPoolStatus getStatus() {
        return status;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }
}
