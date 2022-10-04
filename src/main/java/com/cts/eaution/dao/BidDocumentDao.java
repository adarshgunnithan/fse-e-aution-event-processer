package com.cts.eaution.dao;

import org.springframework.data.repository.Repository;

import com.cts.eaution.entities.BidDocument;

/**
 * @author aadi
 *Dao for BidDocument - No sql db
 */
public interface BidDocumentDao extends Repository<BidDocument, Long>{
	
	/**
	 * To save bid object
	 * @param bidDocument
	 * @return
	 */
	BidDocument save (BidDocument bidDocument);
	

}
