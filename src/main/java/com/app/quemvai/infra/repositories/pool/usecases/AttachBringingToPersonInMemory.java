package com.app.quemvai.infra.repositories.pool.usecases;

import com.app.quemvai.domain.entities.pool.EventPoolPersonBringing;
import com.app.quemvai.infra.models.EventPoolPersonBringingModel;
import com.app.quemvai.infra.models.EventPoolPersonModel;
import com.app.quemvai.infra.repositories.pool.EventPoolPersonBringingRepositoryInMemory;
import com.app.quemvai.infra.repositories.pool.interfaces.AttachBriningToPerson;

public class AttachBringingToPersonInMemory implements AttachBriningToPerson {

    private EventPoolPersonBringingRepositoryInMemory repositoryInMemory;

    public AttachBringingToPersonInMemory(EventPoolPersonBringingRepositoryInMemory repositoryInMemory) {
        this.repositoryInMemory = repositoryInMemory;
    }

    @Override
    public void attach(EventPoolPersonModel eventPoolPersonModel, EventPoolPersonBringing eventPoolPersonBringing) {
        EventPoolPersonBringingModel eventPoolPersonBringingModel = new EventPoolPersonBringingModel(eventPoolPersonModel, eventPoolPersonBringing);

        this.repositoryInMemory.eventPoolPersonBringingModels.add(eventPoolPersonBringingModel);
    }
}
