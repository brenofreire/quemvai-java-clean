package com.app.quemvai.infra.repositories.pool;

import com.app.quemvai.infra.models.EventPoolModel;

public interface EventPoolRepsitoryInterface {
    void create(EventPoolModel eventPoolModel);

    EventPoolModel getUserAccountById(int id);

    void delete(EventPoolModel eventPoolModel);

    EventPoolModel update(EventPoolModel eventPoolModel);
}
