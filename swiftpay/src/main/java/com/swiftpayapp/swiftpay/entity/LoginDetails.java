package com.swiftpayapp.swiftpay.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class LoginDetails {
	
	
	
	@OneToOne
	@JoinColumn(name = "userid")
	private UserDetails userdetails;
	
	@Id
	private int usrid;
	
	private String password;
	
	public String getPassword() {
		return password;
	}
	public int getUsrid() {
		return usrid;
	}
	public void setUsrid(int usrid) {
		this.usrid = usrid;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserDetails getUserdetails() {
		return userdetails;
	}
	public void setUserdetails(UserDetails userdetails) {
		this.userdetails = userdetails;
	}
	
	
	
}
