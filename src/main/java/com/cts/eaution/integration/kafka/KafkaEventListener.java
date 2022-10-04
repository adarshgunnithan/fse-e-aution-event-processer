package com.cts.eaution.integration.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.cts.eaution.integration.kafka.vo.CustomKafkaMessage;
import com.cts.eaution.service.BidCommandService;
import com.cts.eaution.service.ProductCommandService;
import com.cts.eaution.util.DataMapperUtil;
import com.cts.eaution.vo.BidVO;
import com.cts.eaution.vo.ProductVO;

/**
 * @author aadi
 *Kafka Event Listener
 */
@Service
public class KafkaEventListener {

	@Autowired
	ProductCommandService productCommandServiceImpl;
	@Autowired
	BidCommandService bidCommandServiceImpl;

	private static Logger log = LoggerFactory.getLogger(KafkaEventListener.class);
	
	@KafkaListener(id = "bidconsumer", topics = "bidtopic1")
	public void listenBids(String in) {
		log.info("Data Recieved in kafka listner bidconsumer --->"+in);
		DataMapperUtil util = new DataMapperUtil();
		CustomKafkaMessage customMessage = (CustomKafkaMessage) util.getObject(in, CustomKafkaMessage.class);
		if (customMessage.getOperation().equals("CREATE")) {
			BidVO bidVO = (BidVO) util.getObject(customMessage.getData(), BidVO.class);
			boolean status = bidCommandServiceImpl.save(bidVO);
			log.info("Bid save status---->"+ status);
		} else if (customMessage.getOperation().equals("UPDATE")) {
			BidVO bidVO = (BidVO) util.getObject(customMessage.getData(), BidVO.class);
			boolean status = bidCommandServiceImpl.update(bidVO);
			log.info("Bid update status---->"+ status);
		}

	}

	@KafkaListener(id = "productsconsumer", topics = "productstopic1")
	public void listenProducts(String in) {
		log.info("Data Recieved in kafka listner productsconsumer --->"+in);
		DataMapperUtil util = new DataMapperUtil();

		CustomKafkaMessage customMessage = (CustomKafkaMessage) util.getObject(in, CustomKafkaMessage.class);

		if (customMessage.getOperation().equals("CREATE")) {
			ProductVO productVO = (ProductVO) util.getObject(customMessage.getData(), ProductVO.class);
			ProductVO returnProductVO = productCommandServiceImpl.save(productVO);
			log.info("Product save status---->"+ returnProductVO);
		} else if (customMessage.getOperation().equals("DELETE")) {
			Long productId = (Long) util.getObject(customMessage.getData(), Long.class);
			boolean status = productCommandServiceImpl.delete(productId);
			log.info("Product delete status---->"+ status);
		}
		System.out.println();
	}

}
