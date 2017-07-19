package com.koddata.ecommerce.user.address.type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_address_type")
public class AddressType {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;

	
	private String  name;
	
	private String typeIcon;
	

	public AddressType() {
		super();
		 
	}


	public AddressType(int id, String name, String typeIcon) {
		super();
		this.id = id;
		this.name = name;
		this.typeIcon = typeIcon;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTypeIcon() {
		return typeIcon;
	}


	public void setTypeIcon(String typeIcon) {
		this.typeIcon = typeIcon;
	}
	
	
	
	
	

}
