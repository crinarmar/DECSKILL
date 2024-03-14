package com.inditex.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

import org.springframework.stereotype.Component;

import com.inditex.service.Prices;
import com.inditex.service.PricesEntity;

/**
 * Mapper from entity PriceEntity to domain Price
 * @author cnaranjo
 */
@Component
public class PricesMapper {

	public Collection<Prices> mapTo(Collection<PricesEntity> sourceCollection) {

		if (Objects.isNull(sourceCollection) || sourceCollection.isEmpty()) {
			return Collections.emptyList();
		}

		final Collection<Prices> result = new ArrayList<>();
		sourceCollection.forEach(pricesEntity -> result.add(this.mapTo(pricesEntity)));
		return result;
	}

	public Prices mapTo(PricesEntity source) {
		return Prices.maker().id(source.getId()).brandId(source.getBrandId()).startDate(source.getStartDate()).endDate(source.getEndDate())
				.priceList(source.getPriceList()).productId(source.getProductId()).priority(source.getPriority()).price(source.getPrice())
				.currency(source.getCurrency()).build();
	}

	public PricesEntity mapReverse(Prices source) {
		final PricesEntity pricesEntity = new PricesEntity();
		pricesEntity.setId(source.getId());
		pricesEntity.setBrandId(source.getBrandId());
		pricesEntity.setStartDate(source.getStartDate());
		pricesEntity.setEndDate(source.getEndDate());
		pricesEntity.setPriceList(source.getPriceList());
		pricesEntity.setProductId(source.getProductId());
		pricesEntity.setPriority(source.getPriority());
		pricesEntity.setPrice(source.getPrice());
		pricesEntity.setCurrency(source.getCurrency());
		return pricesEntity;
	}
}
