package com.ms.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.restapi.domains.Category;

@Repository
public interface CategoryReposotiry extends JpaRepository<Category, Integer> {

}
