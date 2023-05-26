package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.ProductEntity;
import com.learning.enums.Status;
import com.learning.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping
	public Long createProducts(@RequestBody ProductEntity productEntity) {
		return productService.createProduct(productEntity);
	}
	
	@GetMapping("/{id}")
	public ProductEntity findById(@PathVariable Long id) {
		return productService.findById(id);
	}
	
	@PutMapping
	public Status updateById(@RequestParam Long id,@RequestBody ProductEntity productEntity) {
		return productService.updateById(id, productEntity);
	}
	
	@DeleteMapping
	public Status deleteById(@RequestParam Long id) {
		return productService.deleteById(id);
	}
}
