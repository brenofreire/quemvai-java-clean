package com.app.quemvai.infra.repositories.pool.interfaces;

import java.util.Collection;

import com.app.quemvai.infra.models.EventPoolPersonModel;

public interface AttachPersonToEventPool {
    void attach(Collection<EventPoolPersonModel> listEventPoolPerson);
}
