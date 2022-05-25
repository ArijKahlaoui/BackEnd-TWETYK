package com.spring.pfa.controller;

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

import com.spring.pfa.entity.SousCategory;
import com.spring.pfa.service.SousCategoryService;

@RestController
@RequestMapping("/sousCategory")
@CrossOrigin("*")
public class SousCategoryController {
	
	@Autowired
	private SousCategoryService sousCategoryService;
	
	@PostMapping("/")
	public ResponseEntity<SousCategory> addSousCategory(@RequestBody SousCategory sousCategory){
		//SousCategory sousCategory1 = this.sousCategoryService.addSousCategory(sousCategory);
		return ResponseEntity.ok(this.sousCategoryService.addSousCategory(sousCategory));
	}
	
	
	@PutMapping("/")
	public ResponseEntity<SousCategory> update(@RequestBody SousCategory sousCategory){
		return ResponseEntity.ok(this.sousCategoryService.updateSousCategory(sousCategory));
	}
	
	
	
	@GetMapping("/")
	public ResponseEntity<?> sousCategories(){
		
		return ResponseEntity.ok(this.sousCategoryService.getSousCategories());
		
	}

	
	@GetMapping("/{sid}")
	public SousCategory sousCategory(@PathVariable("sid") Long sid) {
		return this.sousCategoryService.getSousCategory(sid);
	}
	
	
	
	@DeleteMapping("/{sid}")
	public void delete(@PathVariable("sid") Long sid) {
		
		this.sousCategoryService.deleteSousCategory(sid);
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
