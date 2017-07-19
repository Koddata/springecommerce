package com.koddata.ecommerce.user.statistics;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_statistics")
public class Statistics {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	private String ip;
	
	/**
	 * user device or browser
	 */
	private String userAgent;
	
	
	private String requestTime;
	
	private String lastlogin;

	public Statistics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Statistics(int id, String ip, String userAgent, String requestTime, String lastlogin) {
		super();
		this.id = id;
		this.ip = ip;
		this.userAgent = userAgent;
		this.requestTime = requestTime;
		this.lastlogin = lastlogin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getLastlogin() {
		return lastlogin;
	}

	public void setLastlogin(String lastlogin) {
		this.lastlogin = lastlogin;
	}
	
	
	
	
	

}
