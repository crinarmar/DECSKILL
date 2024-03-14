package com.inditex.service;

import static org.junit.Assert.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PriceTest {

	@Test
	void test() {
		Prices prices = Prices.maker().id(1L).brandId(1L).currency("EUR").startDate(LocalDateTime.now()).endDate(LocalDateTime.now())
				.price(Double.valueOf(25.40)).priceList(1L).productId(1L).priority(1).build();
		assertNotNull(prices.getId());
		assertNotNull(prices.getBrandId());
		assertNotNull(prices.getStartDate());
		assertNotNull(prices.getEndDate());
		assertNotNull(prices.getPriceList());
		assertNotNull(prices.getProductId());
		assertNotNull(prices.getPriority());
		assertNotNull(prices.getPrice());
		assertNotNull(prices.getCurrency());
	}

}
