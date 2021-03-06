package com.spring.pfa.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pfa.entity.Product;
import com.spring.pfa.entity.SousCategory;
import com.spring.pfa.repository.ProductRepository;
import com.spring.pfa.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product addProduct(Product product) {
		
		return this.productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		
		return this.productRepository.save(product);
	}

	@Override
	public Set<Product> getProducts() {
		
		return new HashSet<>(this.productRepository.findAll());
	}

	@Override
	public Product getProduct(Long productId) {
		
		return this.productRepository.findById(productId).get();
	}

	@Override
	public Set<Product> getProductsOfSouscat(SousCategory sousCategory) {
		
		return this.productRepository.findBySousCategory(sousCategory);
	}

	@Override
	public void deleteProduct(Long productId) {
		
		Product product= new Product();
		product.setProdId(productId);
		this.productRepository.delete(product);
		
	}

}
