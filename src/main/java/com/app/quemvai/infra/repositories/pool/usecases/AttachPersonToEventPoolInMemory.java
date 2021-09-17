package com.app.quemvai.infra.repositories.pool.usecases;

import java.util.Collection;

import com.app.quemvai.infra.models.EventPoolPersonModel;
import com.app.quemvai.infra.repositories.pool.EventPoolPersonRepositoryInMemory;
import com.app.quemvai.infra.repositories.pool.interfaces.AttachPersonToEventPool;

public class AttachPersonToEventPoolInMemory implements AttachPersonToEventPool {
    private EventPoolPersonRepositoryInMemory repositoryiInMemory;

    public AttachPersonToEventPoolInMemory(EventPoolPersonRepositoryInMemory repositoryiInMemory) {
        this.repositoryiInMemory = repositoryiInMemory;
    }

    @Override
    public void attach(Collection<EventPoolPersonModel> listEventPoolPerson) {
        this.repositoryiInMemory.eventPoolPersons.addAll(listEventPoolPerson);        
    }
}
