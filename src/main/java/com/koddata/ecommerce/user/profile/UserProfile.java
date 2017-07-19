package com.koddata.ecommerce.user.profile;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 

@Entity
@Table(name="user_profile")
public class UserProfile {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	private String name;
	private String surname;
	private String tcNo;
	private String birthYear;
	private String birthMonth;
	private String birthDay;
	private String phone;
	private int    shoppingScore;
	
	
	@Enumerated(EnumType.STRING)
	private Sex sex;
	
	
	public enum Sex
	{
		MALE,
		FEMALE
	}


	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserProfile(int id, String name, String surname, String tcNo, String birthYear, String birthMonth,
			String birthDay, String phone, int shoppingScore, Sex sex) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.tcNo = tcNo;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.phone = phone;
		this.shoppingScore = shoppingScore;
		this.sex = sex;
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


	public String getTcNo() {
		return tcNo;
	}


	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}


	public String getBirthYear() {
		return birthYear;
	}


	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}


	public String getBirthMonth() {
		return birthMonth;
	}


	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}


	public String getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getShoppingScore() {
		return shoppingScore;
	}


	public void setShoppingScore(int shoppingScore) {
		this.shoppingScore = shoppingScore;
	}


	public Sex getSex() {
		return sex;
	}


	public void setSex(Sex sex) {
		this.sex = sex;
	}
	
	
	
}
