package com.inditex.service.repository;

import java.util.Collection;
import java.util.Objects;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import com.inditex.criteria.PricesCriteria;
import com.inditex.mapper.PricesMapper;
import com.inditex.service.Prices;
import com.inditex.service.PricesEntity;
import com.inditex.service.repository.base.BaseJpaRepository;
import com.inditex.service.specification.PricesBetweenData;
import com.inditex.service.specification.PricesByBrandId;
import com.inditex.service.specification.PricesByProductId;

@Repository
public class PricesJpaRepository implements PricesRepository {
	private final BaseJpaRepository baseRepository;
	private final PricesMapper mapper;

	public PricesJpaRepository(BaseJpaRepository repository, PricesMapper mapper) {
		this.baseRepository = repository;
		this.mapper = mapper;
	}

	@Override
	public Collection<Prices> findPrices(PricesCriteria pricesCriteria) {
		return this.mapper.mapTo(baseRepository.findAll(this.getCriteriaSpecification(pricesCriteria)));

	}

	private Specification<PricesEntity> getCriteriaSpecification(PricesCriteria criteria) {

		Specification<PricesEntity> specification = Specification.where(null);

		if (Objects.nonNull(criteria.getProductId())) {
			specification = specification.and(new PricesByProductId(criteria.getProductId()).getSpecification());
		}

		if (Objects.nonNull(criteria.getBrandId())) {
			specification = specification.and(new PricesByBrandId(criteria.getBrandId()).getSpecification());
		}
		if (Objects.nonNull(criteria.getDate())) {
			specification = specification.and(new PricesBetweenData(criteria.getDate()).getSpecification());
		}

		return specification;
	}
}
