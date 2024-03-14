package com.inditex.service.specification;

import org.springframework.data.jpa.domain.Specification;

import com.inditex.service.PricesEntity;

public class PricesByBrandId {
	private final Long brandId;

	public PricesByBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Specification<PricesEntity> getSpecification() {

		return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("brandId"), this.brandId);
	}
}
