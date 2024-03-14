package com.inditex.service.exception;

public class PricesNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public PricesNotFoundException() {
		super("Producto no encontrado");
	}
}
