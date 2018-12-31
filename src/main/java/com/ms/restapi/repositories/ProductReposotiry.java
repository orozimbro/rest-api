package com.ms.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.restapi.domains.Product;

@Repository
public interface ProductReposotiry extends JpaRepository<Product, Integer> {

}
