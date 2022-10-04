package com.cts.eaution.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.eaution.dao.BidDocumentDao;
import com.cts.eaution.entities.BidDocument;
import com.cts.eaution.service.BidCommandService;
import com.cts.eaution.vo.BidVO;
/**
 * @author aadi
 *Command service to save bids
 */
@Service
public class BidCommandServiceImpl implements BidCommandService {
	
	@Autowired
	BidDocumentDao bidDocumentDao;

	@Override
	public boolean save(BidVO bidVO) {
		BidDocument bidDocument= new BidDocument();
		BeanUtils.copyProperties(bidVO, bidDocument);
		bidDocumentDao.save(bidDocument);
		
		return true;
	}

	@Override
	public boolean update(BidVO bidVO) {
		BidDocument bidDocument= new BidDocument();
		BeanUtils.copyProperties(bidVO, bidDocument);
		bidDocumentDao.save(bidDocument);
		return true;
	}

}
