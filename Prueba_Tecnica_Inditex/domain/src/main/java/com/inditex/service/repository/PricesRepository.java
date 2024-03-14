package com.inditex.service.repository;

import java.util.Collection;

import com.inditex.criteria.PricesCriteria;
import com.inditex.service.Prices;

public interface PricesRepository {

	Collection<Prices> findPrices(PricesCriteria pricesCriteria);
}
