package com.cts.eaution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author aadi
 *Root of event processer application
 */
@SpringBootApplication
@EnableMongoRepositories
public class FseEAutionEventProcesserApplication {

	public static void main(String[] args) {
		SpringApplication.run(FseEAutionEventProcesserApplication.class, args);
	}

}
