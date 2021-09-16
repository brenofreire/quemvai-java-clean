package com.app.quemvai.infra.repositories.pool.usecases;

import java.util.List;
import java.util.stream.Collectors;

import com.app.quemvai.infra.models.EventPoolModel;
import com.app.quemvai.infra.repositories.pool.EventPoolRepositoryInMemory;
import com.app.quemvai.infra.repositories.pool.interfaces.GetEventPoolFromUser;

public class GetEventPoolFromUserInMemory implements GetEventPoolFromUser {
    private EventPoolRepositoryInMemory repositoryInMemory;

    public GetEventPoolFromUserInMemory(EventPoolRepositoryInMemory repositoryInMemory) {
        this.repositoryInMemory = repositoryInMemory;
    }

    @Override
    public List<EventPoolModel> get(int userId) {
        return this.repositoryInMemory.eventPoolList.stream().filter(eventPool -> eventPool.getCreatedBy() == userId).collect(Collectors.toList());
    }
}
