package com.cts.eaution.integration.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cts.eaution.service.ProductCommandService;
import com.cts.eaution.util.DataMapperUtil;
import com.cts.eaution.vo.ProductVO;

@Service
public class KafkaEventListener {
	
	@Autowired
	ProductCommandService productCommandServiceImpl;
	
	@KafkaListener(id = "bidconsumer", topics = "bidtopic1")
  public void listenBids(String in) {
      System.out.println("data------------>"+in);
  }
	
	@KafkaListener(id = "productsconsumer", topics = "productstopic1")
	  public void listenProducts(String in) {
	      System.out.println("data------------>"+in);
	      DataMapperUtil util=new DataMapperUtil();
	      
	      ProductVO productVO = (ProductVO) util.getObject(in, ProductVO.class);
	      ProductVO returnProductVO=productCommandServiceImpl.save(productVO);
	      System.out.println();
	  }

}
