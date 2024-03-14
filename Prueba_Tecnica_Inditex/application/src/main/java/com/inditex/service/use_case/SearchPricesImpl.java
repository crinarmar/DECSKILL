package com.inditex.service.use_case;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.inditex.criteria.PricesCriteria;
import com.inditex.service.Prices;
import com.inditex.service.repository.PricesRepository;

@Service
public class SearchPricesImpl implements SearchPrices {

	private final PricesRepository pricesRepository;

	public SearchPricesImpl(PricesRepository pricesRepository) {
		this.pricesRepository = pricesRepository;
	}

	@Override
	public Collection<Prices> searchPrices(PricesCriteria pricesCriteria) {
		return this.pricesRepository.findPrices(pricesCriteria).stream().collect(Collectors.toList());

	}

}
