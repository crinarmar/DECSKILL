package com.inditex.service.specification;

import org.springframework.data.jpa.domain.Specification;

import com.inditex.service.PricesEntity;

public class PricesByProductId {
	private final Long productId;

	public PricesByProductId(Long productId) {
		this.productId = productId;
	}

	public Specification<PricesEntity> getSpecification() {

		return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("productId"), this.productId);
	}
}
