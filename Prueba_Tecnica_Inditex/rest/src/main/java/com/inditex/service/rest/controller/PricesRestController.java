package com.inditex.service.rest.controller;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.inditex.criteria.PricesCriteria;
import com.inditex.service.rest.interfaces.spacecraft.PricesApi;
import com.inditex.service.rest.interfaces.spacecraft.dto.PricesRest;
import com.inditex.service.rest.mapper.PricesRestMapper;
import com.inditex.service.use_case.SearchPrices;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
public class PricesRestController implements PricesApi {

	private final SearchPrices searchPrices;
	private final PricesRestMapper mapper;

	public PricesRestController(SearchPrices searchPrices, PricesRestMapper mapper) {
		this.searchPrices = searchPrices;
		this.mapper = mapper;
	}

	@Override
	public ResponseEntity<List<PricesRest>> listPricesByFilter(@NotNull @Valid OffsetDateTime date, @NotNull @Valid Long productId,
			@NotNull @Valid Long brandId) {

		return ResponseEntity.ok(this.mapper.mapTo(this.searchPrices.searchPrices(new PricesCriteria(productId, brandId, date.toLocalDateTime()))
				.stream().collect(Collectors.toList())));
	}

}
