package com.app.quemvai.infra.repositories.pool.usecases;

import com.app.quemvai.infra.models.EventPoolModel;
import com.app.quemvai.infra.repositories.pool.EventPoolRepositoryInMemory;
import com.app.quemvai.infra.repositories.pool.interfaces.DeleteEventPoolById;

public class DeleteEventPoolByIdInMemory implements DeleteEventPoolById {
    private EventPoolRepositoryInMemory repositoryInMemory;

    DeleteEventPoolByIdInMemory(EventPoolRepositoryInMemory repositoryInMemory) {
        this.repositoryInMemory = repositoryInMemory;
    }

    @Override
    public void delete(EventPoolModel eventPoolModel) {
        this.repositoryInMemory.eventPoolList.removeIf(eventPool -> eventPool.getId() == eventPoolModel.getId());        
    }
}