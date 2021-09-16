package com.app.quemvai;

import java.util.List;

import com.app.quemvai.infra.models.EventPoolModel;
import com.app.quemvai.infra.repositories.pool.EventPoolRepositoryInMemory;
import com.app.quemvai.infra.repositories.pool.interfaces.CreateEventPool;
import com.app.quemvai.infra.repositories.pool.interfaces.GetEventPoolFromUser;
import com.app.quemvai.infra.repositories.pool.usecases.CreateEventPoolInMemory;
import com.app.quemvai.infra.repositories.pool.usecases.GetEventPoolFromUserInMemory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class QuemvaiApplication {

	public static void main(String[] args) {
		EventPoolRepositoryInMemory repositoryInMemory = new EventPoolRepositoryInMemory();

		CreateEventPool createEventPool = new CreateEventPoolInMemory(repositoryInMemory);

		EventPoolModel eventModel = new EventPoolModel();

		eventModel.setCreatedBy(1);
		eventModel.setTitle("Test");

		createEventPool.create(eventModel);

		GetEventPoolFromUser getEventPoolFromUser = new GetEventPoolFromUserInMemory(repositoryInMemory);

		List<EventPoolModel> list = getEventPoolFromUser.get(1);

		System.out.println("Teste:" + list.get(0).getTitle());

		SpringApplication.run(QuemvaiApplication.class, args);
	}

}
