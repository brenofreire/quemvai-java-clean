package com.app.quemvai.infra.repositories.pool;

import java.util.ArrayList;
import java.util.Collection;

import com.app.quemvai.infra.models.EventPoolPersonModel;

public class EventPoolPersonRepositoryInMemory {
    public Collection<EventPoolPersonModel> eventPoolPersons = new ArrayList<EventPoolPersonModel>();
}
