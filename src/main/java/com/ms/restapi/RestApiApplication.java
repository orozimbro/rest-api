package com.ms.restapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ms.restapi.domains.Category;
import com.ms.restapi.domains.Product;
import com.ms.restapi.repositories.CategoryReposotiry;
import com.ms.restapi.repositories.ProductReposotiry;

@SpringBootApplication
public class RestApiApplication implements CommandLineRunner  {

	@Autowired
	private CategoryReposotiry categoryRepo;
	@Autowired
	private ProductReposotiry productRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//instantiating tables for tests
		Category cat1 = new Category(null, "Books");
		Category cat2 = new Category(null, "Magazines");
		categoryRepo.saveAll(Arrays.asList(cat1, cat2));
		
		Product prod1 = new Product(null, "Book", 34.00);
		prod1.setCategories(Arrays.asList(cat1));
		Product prod2 = new Product(null, "MagaBook", 64.00);
		prod2.setCategories(Arrays.asList(cat1,cat2));
		Product prod3 = new Product(null, "Magazine", 28.00);
		prod3.setCategories(Arrays.asList(cat2));
		
		productRepo.saveAll(Arrays.asList(prod1,prod2,prod3));
	}

}

