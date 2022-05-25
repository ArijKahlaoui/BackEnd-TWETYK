package com.spring.pfa.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pfa.entity.SousCategory;
import com.spring.pfa.repository.SousCategoryRepository;
import com.spring.pfa.service.SousCategoryService;
@Service
public class SousCategoryServiceImpl implements SousCategoryService{

	@Autowired
	private SousCategoryRepository sousCategoryRepository ;
	
	
	@Override
	public SousCategory addSousCategory(SousCategory sousCategory) {
		
		return this.sousCategoryRepository.save(sousCategory);
	}

	@Override
	public SousCategory updateSousCategory(SousCategory sousCategory) {
		
		return this.sousCategoryRepository.save(sousCategory);
	}

	@Override
	public Set<SousCategory> getSousCategories() {
		
		return new HashSet<>(this.sousCategoryRepository.findAll());
	}

	@Override
	public SousCategory getSousCategory(Long sousCategoryId) {
		
		return this.sousCategoryRepository.findById(sousCategoryId).get();
	}

	@Override
	public void deleteSousCategory(Long sousCategoryId) {
		
		SousCategory sousCategory = new SousCategory();
		
		sousCategory.setSid(sousCategoryId);
		
		this.sousCategoryRepository.delete(sousCategory);
		
	}

}
