package com.spring.pfa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long prodId;
	
	private String name;
	
	private int stock;
	
	@Column(length = 5000)
	private String content;
	
	private String image;
	
	private boolean active = false;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	private SousCategory sousCategory;

	
	
	

	public Product() {
		super();
	}

	
	
	

	public SousCategory getSousCategory() {
		return sousCategory;
	}





	public void setSousCategory(SousCategory sousCategory) {
		this.sousCategory = sousCategory;
	}





	public int getStock() {
		return stock;
	}




	public void setStock(int stock) {
		this.stock = stock;
	}









	public Long getProdId() {
		return prodId;
	}


	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}



	public boolean isActive() {
		return active;
	}





	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	

}
