package com.app.quemvai.infra.repositories.pool.interfaces;

import com.app.quemvai.infra.models.EventPoolModel;

public interface DeleteEventPoolById {
    void delete(EventPoolModel eventPoolModel);
}