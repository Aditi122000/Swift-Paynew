package com.swiftpayapp.swiftpay.entity;
import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class SupportRequests {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "requestid_generator")
    @SequenceGenerator(name = "requestid_generator",initialValue = 1,allocationSize = 1,sequenceName = "requestid_seq")
	private int requestid;
	
	
	private String subject;
	private String description;
	private String status;
	private Date creationdate;
	private Date resolutiondate;
	
	
	
	@ManyToOne
	@JoinColumn(name="userid")
	private UserDetails userdetails;
	
	@ManyToOne
	@JoinColumn(name="adminid")
	private AdminLogin adminlogin;
	
	public int getRequestid() {
		return requestid;
	}
	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}
		public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreationdate() {
		return creationdate;
	}
	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}
	public Date getResolutiondate() {
		return resolutiondate;
	}
	public void setResolutiondate(Date resolutiondate) {
		this.resolutiondate = resolutiondate;
	}
	public UserDetails getUserdetails() {
		return userdetails;
	}
	public void setUserdetails(UserDetails userdetails) {
		this.userdetails = userdetails;
	}
	public AdminLogin getAdminlogin() {
		return adminlogin;
	}
	public void setAdminlogin(AdminLogin adminlogin) {
		this.adminlogin = adminlogin;
	}
	
	
	
}
