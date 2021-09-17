package com.app.quemvai;

import com.app.quemvai.domain.entities.pool.EventPoolPerson;
import com.app.quemvai.domain.entities.pool.EventPoolPersonBringing;
import com.app.quemvai.infra.models.EventPoolPersonBringingModel;
import com.app.quemvai.infra.models.EventPoolPersonModel;
import com.app.quemvai.infra.repositories.pool.EventPoolPersonBringingRepositoryInMemory;
import com.app.quemvai.infra.repositories.pool.interfaces.AttachBriningToPerson;
import com.app.quemvai.infra.repositories.pool.usecases.AttachBringingToPersonInMemory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuemvaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuemvaiApplication.class, args);
	}
}
