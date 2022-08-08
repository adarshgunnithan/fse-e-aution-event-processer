package com.cts.eaution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class FseEAutionEventProcesserApplication {

	public static void main(String[] args) {
		SpringApplication.run(FseEAutionEventProcesserApplication.class, args);
	}

}
