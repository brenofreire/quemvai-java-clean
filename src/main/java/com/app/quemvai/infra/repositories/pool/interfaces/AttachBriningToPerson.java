package com.app.quemvai.infra.repositories.pool.interfaces;

import com.app.quemvai.domain.entities.pool.EventPoolPersonBringing;
import com.app.quemvai.infra.models.EventPoolPersonModel;

public interface AttachBriningToPerson {
    void attach(EventPoolPersonModel eventPoolPersonModel, EventPoolPersonBringing eventPoolPersonBringing);
}
