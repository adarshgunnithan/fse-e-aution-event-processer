package com.cts.eaution.dao;

import org.springframework.data.repository.Repository;

import com.cts.eaution.entities.ProductDocument;
/**
 * @author aadi
 *DAO object to Product document -nosql
 */
public interface ProductDocumentDao extends Repository<ProductDocument, Long> {

	/**
	 * @param productDocument
	 * @return
	 */
	ProductDocument save (ProductDocument productDocument);
	
	/**
	 * @param id
	 */
	public void deleteById(Long id);

}
