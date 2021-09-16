package com.app.quemvai.infra.repositories.pool.usecases;

import java.util.ArrayList;
import java.util.List;

import com.app.quemvai.infra.models.EventPoolModel;
import com.app.quemvai.infra.repositories.pool.EventPoolRepsitoryInterface;

public class EventPoolRepositoryInMemory implements EventPoolRepsitoryInterface {
    List<EventPoolModel> eventPoolList = new ArrayList<EventPoolModel>();
    EventPoolModel eventPool;

    @Override
    public void create(EventPoolModel eventPoolModel) {
        this.eventPoolList.add(eventPoolModel);
    }

    @Override
    public void delete(EventPoolModel eventPoolModel) {
        this.eventPoolList.removeIf(eventPool -> eventPool.getId() == eventPoolModel.getId());        
    }

    @Override
    public EventPoolModel getUserAccountById(int eventPoolModelId) {
        EventPoolModel eventPoolModel = this.eventPoolList.stream().filter(eventPool -> eventPool.getId() == eventPoolModelId).findFirst().get();

        return eventPoolModel;
    }

    @Override
    public EventPoolModel update(EventPoolModel eventPoolModel) {
        this.eventPoolList.stream().map(eventPoolInner -> {
            if(eventPoolInner.getId() == eventPoolModel.getId()) {
                this.eventPool = eventPoolInner;
            }
            return eventPoolInner;
        });

        return this.eventPool;
    }
}
