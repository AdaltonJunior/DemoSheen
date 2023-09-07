package br.com.adaltonjunior.DemoSheen.products.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.adaltonjunior.DemoSheen.products.model.Product;
import br.com.adaltonjunior.DemoSheen.products.model.ProductRepository;
import br.com.adaltonjunior.DemoSheen.products.services.exceptions.ProductNotExistException;

@Service
class ProductCrudServiceImpl implements ProductCrudService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product find(Long id) throws ProductNotExistException {
		return productRepository.findById(id).orElseThrow(() -> new ProductNotExistException(id));
	}
	
	@Override
	public Collection<Product> findAll() {
		Collection<Product> list = new ArrayList<>();
		productRepository.findAll().forEach(list::add);
		return list;
	}

	@Override
	public Collection<Product> findAll(Long[] ids) throws ProductNotExistException {
		Collection<Product> found = new LinkedHashSet<>();// found products
        Collection<Long> notFound = new LinkedHashSet<>();  // not found products

        Arrays.asList(ids).forEach(id -> {
            if (productRepository.existsById(id)) {
                found.add(productRepository.findById(id).orElseThrow(() -> new ProductNotExistException(id)));
            } else {
                notFound.add(id);
            }
        });

        if (!notFound.isEmpty()) {
            throw new ProductNotExistException(notFound);
        }

		return found;
	}

}
