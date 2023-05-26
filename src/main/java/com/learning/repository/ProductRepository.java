package com.learning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.entity.ProductEntity;
import com.learning.enums.Category;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{
	List<ProductEntity> findByName(String name);
	List<ProductEntity> findByCategory(Category category);
	//List<ProductEntity> findByLocalDate(LocalDate localDate);
}