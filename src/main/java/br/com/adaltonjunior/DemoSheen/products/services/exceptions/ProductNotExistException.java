package br.com.adaltonjunior.DemoSheen.products.services.exceptions;

import java.util.Collection;

public class ProductNotExistException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6655183389150507468L;

	public ProductNotExistException(Long id) {
		super("Could not find product " + id);
	}
	
	public ProductNotExistException(Collection<Long> id) {
		super("Could not find products " + id);
	}
	
}
