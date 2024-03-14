package com.inditex.service.rest.mapper;

import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Component;

import com.inditex.service.Prices;
import com.inditex.service.rest.interfaces.spacecraft.dto.PricesRest;

/**
 * Mapeador de objetos de dominio a objetos Rest
 * @author cnaranjo
 */
@Component
public class PricesRestMapper {
	public PricesRest mapTo(Prices source) {
		Objects.requireNonNull(source);
		final PricesRest pricesRest = new PricesRest(source.getId(), source.getBrandId(),
				source.getStartDate().atOffset(ZoneOffset.ofTotalSeconds(0)), source.getEndDate().atOffset(ZoneOffset.ofTotalSeconds(0)),
				source.getPriceList(), source.getPrice());
		return pricesRest;
	}

	public List<PricesRest> mapTo(Collection<Prices> source) {
		Objects.requireNonNull(source);
		final List<PricesRest> destinyCollection = new ArrayList<>();
		source.forEach(sourcePrice -> destinyCollection.add(this.mapTo(sourcePrice)));
		return destinyCollection;
	}

}
