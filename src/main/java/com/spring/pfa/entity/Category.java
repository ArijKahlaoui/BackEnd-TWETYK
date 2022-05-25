package com.spring.pfa.entity;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cid;
	
	private String title;
	@Column(length = 100)
	private String description;
	
	private String imageURL;
	
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER,mappedBy = "category")
	@JsonIgnore
	private Set<SousCategory> sousCategories=new LinkedHashSet<>();

	
	public Category() {
		super();
	}


	public Category(String title, String description,String imageURL) {
		super();
		this.title = title;
		this.description = description;
		this.imageURL = imageURL;
	}


	public Long getCid() {
		return cid;
	}


	public void setCid(Long cid) {
		this.cid = cid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getImageURL() {
		return imageURL;
	}


	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}


	public Set<SousCategory> getSousCategories() {
		return sousCategories;
	}


	public void setSousCategories(Set<SousCategory> sousCategories) {
		this.sousCategories = sousCategories;
	}
	
	
	
	
}
