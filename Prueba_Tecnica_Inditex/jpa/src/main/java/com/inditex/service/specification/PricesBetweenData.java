package com.inditex.service.specification;

import java.time.LocalDateTime;

import org.springframework.data.jpa.domain.Specification;

import com.inditex.service.PricesEntity;

public class PricesBetweenData {
	private final LocalDateTime date;

	public PricesBetweenData(LocalDateTime date) {
		this.date = date;
	}

	public Specification<PricesEntity> getSpecification() {
		return (root, query, criteriaBuilder) -> criteriaBuilder.and(criteriaBuilder.lessThanOrEqualTo(root.get("startDate"), date),
				criteriaBuilder.greaterThanOrEqualTo(root.get("endDate"), date));
	}

}
