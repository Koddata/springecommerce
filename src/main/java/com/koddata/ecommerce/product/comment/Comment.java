package com.koddata.ecommerce.product.comment;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_comment")
public class Comment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String title;
	private String comment;
	private String positive;
	private boolean active=false;
	private int yesNumber;
	private int noNumber;	
	private String ip;
	private Timestamp createdAt;
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(int id, String title, String comment, String positive, boolean active, int yesNumber, int noNumber,
			String ip, Timestamp createdAt) {
		super();
		this.id = id;
		this.title = title;
		this.comment = comment;
		this.positive = positive;
		this.active = active;
		this.yesNumber = yesNumber;
		this.noNumber = noNumber;
		this.ip = ip;
		this.createdAt = createdAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getPositive() {
		return positive;
	}

	public void setPositive(String positive) {
		this.positive = positive;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getYesNumber() {
		return yesNumber;
	}

	public void setYesNumber(int yesNumber) {
		this.yesNumber = yesNumber;
	}

	public int getNoNumber() {
		return noNumber;
	}

	public void setNoNumber(int noNumber) {
		this.noNumber = noNumber;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	
	
	

}
