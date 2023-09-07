package br.com.adaltonjunior.DemoSheen.products.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.adaltonjunior.DemoSheen.products.model.Product;
import br.com.adaltonjunior.DemoSheen.products.services.ProductCrudService;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
class ProductController {
	
	@Autowired
	private ProductCrudService productCrudService;
	
	@GetMapping("/")
	public List<Product> all(@RequestParam(required = false) Long[] ids) {
		List<Product> list = new ArrayList<>();
		if(ids != null && ids.length > 0) {
			productCrudService.findAll().forEach(list::add);
		}else {
			productCrudService.findAll().forEach(list::add);
		}
		return list;
	}
	
	@GetMapping("/{id}")
	public Product get(@PathVariable Long id) {
		return productCrudService.find(id);
	}
	
}
