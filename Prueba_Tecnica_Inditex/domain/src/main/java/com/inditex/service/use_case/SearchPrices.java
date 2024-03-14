package com.inditex.service.use_case;

import java.util.Collection;

import com.inditex.criteria.PricesCriteria;
import com.inditex.service.Prices;

public interface SearchPrices {

	Collection<Prices> searchPrices(PricesCriteria pricesCriteria);
}
