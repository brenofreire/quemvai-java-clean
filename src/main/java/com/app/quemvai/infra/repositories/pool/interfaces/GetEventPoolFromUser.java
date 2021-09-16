package com.app.quemvai.infra.repositories.pool.interfaces;

import java.util.List;

import com.app.quemvai.infra.models.EventPoolModel;

public interface GetEventPoolFromUser {
    List<EventPoolModel> get(int userId);
}
