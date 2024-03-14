package com.inditex.service;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class Prices {

	private Long id;

	private Long brandId;

	private LocalDateTime startDate;

	private LocalDateTime endDate;

	private Long priceList;

	private Long productId;

	private Integer priority;

	private Double price;

	private String currency;

	public static Builder maker() {
		return new Builder();
	}

	public static class Builder {
		private final Prices prices;

		private Builder() {
			this.prices = new Prices();
		}

		public Builder id(Long id) {
			prices.id = id;
			return this;
		}

		public Builder brandId(Long brandId) {
			prices.brandId = brandId;
			return this;
		}

		public Builder startDate(LocalDateTime startDate) {
			prices.startDate = startDate;
			return this;
		}

		public Builder endDate(LocalDateTime endDate) {
			prices.endDate = endDate;
			return this;
		}

		public Builder priceList(Long priceList) {
			prices.priceList = priceList;
			return this;
		}

		public Builder productId(Long productId) {
			prices.productId = productId;
			return this;
		}

		public Builder priority(Integer priority) {
			prices.priority = priority;
			return this;
		}

		public Builder price(Double price) {
			prices.price = price;
			return this;
		}

		public Builder currency(String currency) {
			prices.currency = currency;
			return this;
		}

		public Prices build() {
			return prices;
		}

	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the brandId
	 */
	public Long getBrandId() {
		return brandId;
	}

	/**
	 * @param brandId the brandId to set
	 */
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	/**
	 * @return the startDate
	 */
	public LocalDateTime getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public LocalDateTime getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the priceList
	 */
	public Long getPriceList() {
		return priceList;
	}

	/**
	 * @param priceList the priceList to set
	 */
	public void setPriceList(Long priceList) {
		this.priceList = priceList;
	}

	/**
	 * @return the productId
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * @return the priority
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
