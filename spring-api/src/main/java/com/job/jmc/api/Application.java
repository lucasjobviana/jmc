package com.job.jmc.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.job.jmc.api.entities")
@EnableJpaRepositories("com.job.jmc.api.repositories")
@ComponentScan("com.job.jmc")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
