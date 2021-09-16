package com.app.quemvai.infra.repositories.pool;

import java.util.ArrayList;
import java.util.List;

import com.app.quemvai.infra.models.EventPoolModel;

public class EventPoolRepositoryInMemory {
    public List<EventPoolModel> eventPoolList = new ArrayList<EventPoolModel>();
}
