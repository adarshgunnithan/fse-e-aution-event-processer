package com.cts.eaution.vo;

import java.math.BigDecimal;
import java.util.Date;

import com.cts.eaution.entities.Category;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author aadi
 *VO for product entity
 */
//@Validated
public class ProductVO {
	private Long id;
	
	private String name;
	private String shortDescription;
	private Category category;
	private BigDecimal startingPrice;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date bidEndDate;
	private Date createdDate;
	private Long createdBy;
	private String detailedDescription;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	public BigDecimal getStartingPrice() {
		return startingPrice;
	}
	public void setStartingPrice(BigDecimal startingPrice) {
		this.startingPrice = startingPrice;
	}
	public Date getBidEndDate() {
		return bidEndDate;
	}
	public void setBidEndDate(Date bidEndDate) {
		this.bidEndDate = bidEndDate;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public String getDetailedDescription() {
		return detailedDescription;
	}
	public void setDetailedDescription(String detailedDescription) {
		this.detailedDescription = detailedDescription;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}


	
}
