package com.cts.eaution.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.eaution.dao.ProductDocumentDao;
import com.cts.eaution.entities.ProductDocument;
import com.cts.eaution.service.ProductCommandService;
import com.cts.eaution.vo.ProductVO;
/**
 * @author aadi
 *Command service for products
 */
@Service
public class ProductCommandServiceImpl implements ProductCommandService{

	@Autowired
	ProductDocumentDao productDocumentDao;
	
	@Override
	public ProductVO save(ProductVO productVO) {
		ProductDocument productDocument = new ProductDocument();
		BeanUtils.copyProperties(productVO, productDocument);
		//productDocument.setCategory(productVO.getCategory().toString());
		
		ProductDocument savedDocument = productDocumentDao.save(productDocument);
		ProductVO returnVO = new ProductVO();
		BeanUtils.copyProperties(savedDocument, returnVO);
		return returnVO;
	}
	
	@Override
	public boolean delete(Long productID) {
		productDocumentDao.deleteById(productID);
		return true;
	}

}
