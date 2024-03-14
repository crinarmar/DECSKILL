package com.inditex.service.use_case;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.inditex.criteria.PricesCriteria;
import com.inditex.service.Prices;
import com.inditex.service.repository.PricesRepository;

@ExtendWith(MockitoExtension.class)
public class SearchPricesImplTest {

	@InjectMocks
	private SearchPricesImpl searchPricesImpl;

	@Mock
	private PricesRepository pricesRepository;

	@Test
	void searchPrices() {
		when(this.pricesRepository.findPrices(Mockito.any())).thenReturn(new ArrayList<Prices>());
		assertNotNull(this.searchPricesImpl.searchPrices(new PricesCriteria(1L, 1L, LocalDateTime.now())));
	}

}
