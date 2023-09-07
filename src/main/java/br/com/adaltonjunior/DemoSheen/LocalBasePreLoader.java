package br.com.adaltonjunior.DemoSheen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adaltonjunior.DemoSheen.products.model.Product;
import br.com.adaltonjunior.DemoSheen.products.model.ProductRepository;

@Configuration
public class LocalBasePreLoader {
	
	private static final Logger log = LoggerFactory.getLogger(LocalBasePreLoader.class);

	@Bean
	CommandLineRunner initDatabase(ProductRepository repository) {
		return args -> {
			log.info("Preloading " + repository.save(new Product(1l, "women", "img/product/product-1.jpg", "Buttons tweed blazer", 5, 59d, null, true, false, false)));
			log.info("Preloading " + repository.save(new Product(2l, "men", "img/product/product-2.jpg", "Flowy striped skirt", 5, 49d, null, false, false, false)));
			log.info("Preloading " + repository.save(new Product(3l, "men", "img/product/product-3.jpg", "Cotton T-Shirt", 5, 59d, null, false, true, false)));
			log.info("Preloading " + repository.save(new Product(4l, "men", "img/product/product-4.jpg", "Slim striped pocket shirt", 5, 59d, null, false, false, false)));
			log.info("Preloading " + repository.save(new Product(5l, "men", "img/product/product-5.jpg", "Fit micro corduroy shirt", 5, 59d, null, false, false, false)));
			log.info("Preloading " + repository.save(new Product(6l, "men", "img/product/product-6.jpg", "Tropical Kimono", 5, 49d, 59d, false, false, true)));
			log.info("Preloading " + repository.save(new Product(7l, "men", "img/product/product-7.jpg", "Contrasting sunglasses", 5, 59d, null, false, false, false)));
			log.info("Preloading " + repository.save(new Product(8l, "men", "img/product/product-8.jpg", "Water resistant backpack", 5, 49d, 59d, false, false, true)));
		};
	}
	
}
