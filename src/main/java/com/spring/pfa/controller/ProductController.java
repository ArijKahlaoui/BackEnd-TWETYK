package com.spring.pfa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.pfa.entity.Product;
import com.spring.pfa.entity.SousCategory;
import com.spring.pfa.service.ProductService;
import com.spring.pfa.service.SousCategoryService;



@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private SousCategoryService sousCategoryService;
	
	@PostMapping("/")
	public ResponseEntity<Product> add(@RequestBody Product product){
		
		return ResponseEntity.ok(this.productService.addProduct(product));
		
	}
	
	
	
	@PutMapping("/")
	public ResponseEntity<Product> update(@RequestBody Product product){
		return ResponseEntity.ok(this.productService.updateProduct(product));
	}
	
	
	@GetMapping("/")
	public ResponseEntity<?> Products(){
		
		return ResponseEntity.ok(this.productService.getProducts());
		
	}
	
	@GetMapping("/product/{sid}")
	public ResponseEntity<?> getProductsOfSouscat(@PathVariable("sid") Long sid){
		
		
		  SousCategory sousCategory = new SousCategory(); sousCategory.setSid(sid);
		  Set<Product> productOfCatigory = this.productService.getProductsOfSouscat(sousCategory);
		  
		  return ResponseEntity.ok(productOfCatigory);
		
		
		
	}
	
	
	
	
	@GetMapping("/{prodId}")
	public Product get(@PathVariable("prodId") Long prodId) {
		return this.productService.getProduct(prodId);
	}
	
	
	
	
	
	
	@DeleteMapping("/{prodId}")
	public void delete(@PathVariable("prodId") Long prodId) {
		
		this.productService.deleteProduct(prodId);
	
		
	}
	
	
	
	
	
	
	
	
}
