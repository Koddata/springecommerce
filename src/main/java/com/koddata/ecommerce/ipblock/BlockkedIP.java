package com.koddata.ecommerce.ipblock;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class BlockkedIP {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
}
