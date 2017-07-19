package com.koddata.ecommerce.product.kdv;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_kdv")
public class Kdv {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String typeName;
	
	private int kdv;

	public Kdv() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kdv(int id, String typeName, int kdv) {
		super();
		this.id = id;
		this.typeName = typeName;
		this.kdv = kdv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public int getKdv() {
		return kdv;
	}

	public void setKdv(int kdv) {
		this.kdv = kdv;
	}
	
	
	
	
}
