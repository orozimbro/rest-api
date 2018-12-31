package com.ms.restapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.restapi.domains.Category;
import com.ms.restapi.repositories.CategoryReposotiry;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryReposotiry repo;
	
	public Category find(Integer id) {
		Optional<Category> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
