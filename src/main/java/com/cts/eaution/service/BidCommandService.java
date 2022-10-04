package com.cts.eaution.service;

import com.cts.eaution.vo.BidVO;

/**
 * @author aadi
 * Command service for Bids
 */
public interface BidCommandService {
	
	/**
	 * To save bid
	 * @param bidVO
	 * @return
	 */
	boolean save(BidVO bidVO);
	
	 /**
	  * To update bid
	 * @param bidVO
	 * @return
	 */
	boolean update(BidVO bidVO); 

}
