package com.koddata.ecommerce.product.profile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 

@Entity
@Table(name="product_profile")
public class Profile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false)
	private String Description;
	
	private int giftPoint;
	
	private int views;
 
	private boolean active;

	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile(int id, String description, int giftPoint, int views, boolean active) {
		super();
		this.id = id;
		Description = description;
		this.giftPoint = giftPoint;
		this.views = views;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getGiftPoint() {
		return giftPoint;
	}

	public void setGiftPoint(int giftPoint) {
		this.giftPoint = giftPoint;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
 
 
	
	
	
	

}
