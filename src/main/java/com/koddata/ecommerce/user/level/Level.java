package com.koddata.ecommerce.user.level;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_level")
public class Level {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	//image name
	private String levelIcon;
	
	private boolean active;

	public Level() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Level(int id, String name, String levelIcon, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.levelIcon = levelIcon;
		this.active = active;
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

	public String getLevelIcon() {
		return levelIcon;
	}

	public void setLevelIcon(String levelIcon) {
		this.levelIcon = levelIcon;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
	
	

}
