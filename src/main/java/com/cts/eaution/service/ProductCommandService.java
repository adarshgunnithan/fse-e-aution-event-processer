package com.cts.eaution.service;

import com.cts.eaution.vo.ProductVO;

/**
 * @author aadi
 *API for product command services
 */
public interface ProductCommandService {
	
	/**
	 * To save product
	 * @param productVO
	 * @return
	 */
	ProductVO save(ProductVO productVO);
	
	/**
	 * To delete product
	 * @param productID
	 * @return
	 */
	boolean delete (Long productID);

}
