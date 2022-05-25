package com.spring.pfa.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.pfa.entity.Product;
import com.spring.pfa.entity.SousCategory;

public interface ProductRepository extends JpaRepository<Product,Long>{

	Set<Product> findBySousCategory(SousCategory sousCategory);

}
