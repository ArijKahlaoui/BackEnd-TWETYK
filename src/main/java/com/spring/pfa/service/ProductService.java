package com.spring.pfa.service;

import java.util.Set;

import com.spring.pfa.entity.Product;
import com.spring.pfa.entity.SousCategory;



public interface ProductService {
	
	public Product addProduct(Product product);
	
	public Product updateProduct(Product product);
	
	public Set<Product> getProducts();
	
	public Product getProduct(Long productId);
	
	public Set<Product> getProductsOfSouscat(SousCategory sousCategory);
	
	public void deleteProduct(Long productId);

}
