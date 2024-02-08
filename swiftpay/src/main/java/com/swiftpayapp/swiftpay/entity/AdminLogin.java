package com.swiftpayapp.swiftpay.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class AdminLogin {
	
	
	
	@OneToMany(mappedBy = "adminlogin")
	private List<SupportRequests> supportrequets;
	
	@Id
	private int adminId;
	
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<SupportRequests> getSupportrequets() {
		return supportrequets;
	}
	public void setSupportrequets(List<SupportRequests> supportrequets) {
		this.supportrequets = supportrequets;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	
	
	
}
