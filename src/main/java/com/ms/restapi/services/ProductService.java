package com.ms.restapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.restapi.domains.Product;
import com.ms.restapi.repositories.ProductReposotiry;

@Service
public class ProductService {
	
	@Autowired
	private ProductReposotiry repo;
	
	public Product find(Integer id) {
		Optional<Product> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
