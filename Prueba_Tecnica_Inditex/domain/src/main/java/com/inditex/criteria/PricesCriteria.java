package com.inditex.criteria;

import java.time.LocalDateTime;

public class PricesCriteria {

	private final Long productId;
	private final Long brandId;
	private final LocalDateTime date;

	public PricesCriteria(Long productId, Long brandId, LocalDateTime date) {
		this.productId = productId;
		this.brandId = brandId;
		this.date = date;
	}

	/**
	 * @return the productId
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * @return the brandId
	 */
	public Long getBrandId() {
		return brandId;
	}

	/**
	 * @return the startDate
	 */
	public LocalDateTime getDate() {
		return date;
	}

}
