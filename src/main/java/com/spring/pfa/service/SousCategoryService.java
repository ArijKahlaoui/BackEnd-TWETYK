package com.spring.pfa.service;

import java.util.Set;

import com.spring.pfa.entity.SousCategory;


public interface SousCategoryService {
	public SousCategory addSousCategory(SousCategory sousCategory);
	
	public SousCategory updateSousCategory(SousCategory sousCategory);
	
	public Set<SousCategory> getSousCategories();
	
	public SousCategory getSousCategory(Long sousCategoryId);
	
	public void deleteSousCategory(Long sousCategoryId);

}
