package com.inditex.metamodel;

import java.time.LocalDateTime;

import com.inditex.service.PricesEntity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(PricesEntity.class)
public class PricesEntity_ {

	public static volatile SingularAttribute<PricesEntity, Long> brandId;
	public static volatile SingularAttribute<PricesEntity, LocalDateTime> startDate;
	public static volatile SingularAttribute<PricesEntity, LocalDateTime> endDate;
	public static volatile SingularAttribute<PricesEntity, Long> priceList;
	public static volatile SingularAttribute<PricesEntity, Long> productId;
	public static volatile SingularAttribute<PricesEntity, Integer> priority;
	public static volatile SingularAttribute<PricesEntity, Double> price;
	public static volatile SingularAttribute<PricesEntity, String> currency;
}
