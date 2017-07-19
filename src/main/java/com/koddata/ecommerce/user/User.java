package com.koddata.ecommerce.user;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	private String surname;
	
	private String email;
	private double enable;
	private String password;
	private Timestamp lastLogin;
	private String token;
	
	private String confirmationToken;
	private String roles;
	private String ip;
	
	



	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int id, String name, String surname, String email, double enable, String password, Timestamp lastLogin,
			String token, String confirmationToken, String roles, String ip) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.enable = enable;
		this.password = password;
		this.lastLogin = lastLogin;
		this.token = token;
		 
		this.confirmationToken = confirmationToken;
		this.roles = roles;
		this.ip = ip;
		 
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


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getEnable() {
		return enable;
	}


	public void setEnable(double enable) {
		this.enable = enable;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Timestamp getLastLogin() {
		return lastLogin;
	}


	public void setLastLogin(Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}


 


	public String getConfirmationToken() {
		return confirmationToken;
	}


	public void setConfirmationToken(String confirmationToken) {
		this.confirmationToken = confirmationToken;
	}


	public String getRoles() {
		return roles;
	}


	public void setRoles(String roles) {
		this.roles = roles;
	}


	public String getIp() {
		return ip;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}


 
	
	
	

}
