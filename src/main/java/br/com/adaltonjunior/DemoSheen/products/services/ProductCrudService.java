package br.com.adaltonjunior.DemoSheen.products.services;

import java.util.Collection;

import br.com.adaltonjunior.DemoSheen.products.model.Product;
import br.com.adaltonjunior.DemoSheen.products.services.exceptions.ProductNotExistException;

public interface ProductCrudService {
    
    /**
     * Returns products found by it's id.
     *
     * @param id    product id
     *
     * @return found product
     *
     * @throws ProductNotExistException
     *      if products not found by id
     */
    Product find(Long id) throws ProductNotExistException;
	
	/**
     * @return all existing products.
     */
    Collection<Product> findAll();

    /**
     * Returns products found by it's ids.
     *
     * @param ids    products ids
     *
     * @return found products.
     *
     * @throws ProductNotExistException
     *      if one or more product are not found
     */
    Collection<Product> findAll(Long[] ids) throws ProductNotExistException;
	
}
