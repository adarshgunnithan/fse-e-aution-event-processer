package com.cts.eaution.integration.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class KafkaEventListener {
	
	@KafkaListener(id = "bidconsumer", topics = "bidtopic1")
  public void listen(String in) {
      System.out.println("data------------>"+in);
  }

}
