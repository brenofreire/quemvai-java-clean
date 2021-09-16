package com.app.quemvai.infra.repositories.pool.usecases;

import com.app.quemvai.infra.models.EventPoolModel;
import com.app.quemvai.infra.repositories.pool.EventPoolRepositoryInMemory;
import com.app.quemvai.infra.repositories.pool.interfaces.CreateEventPool;

public class CreateEventPoolInMemory implements CreateEventPool {    
    private EventPoolRepositoryInMemory repositoryInMemory;

    public CreateEventPoolInMemory(EventPoolRepositoryInMemory repositoryInMemory) {
        this.repositoryInMemory = repositoryInMemory;
    }

    @Override
    public void create(EventPoolModel eventPoolModel) {
        this.repositoryInMemory.eventPoolList.add(eventPoolModel);
    }
}
