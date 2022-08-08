package com.cts.eaution.dao;

import org.springframework.data.repository.Repository;

import com.cts.eaution.entities.ProductDocument;
public interface ProductDocumentDao extends Repository<ProductDocument, Long> {

	ProductDocument save (ProductDocument productDocument);
	
//	ProductDocument update (ProductDocument productDocument);

}
