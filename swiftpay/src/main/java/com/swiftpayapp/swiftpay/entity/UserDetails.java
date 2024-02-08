package com.swiftpayapp.swiftpay.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class UserDetails {
	
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int user_id;
    private String user_name;
	private String first_name;
	private String last_name;
	private String contact_no;
	private String Address;
	private String city;
	private String ustate;
	private Date date_of_birth;
	private char gender;
	private String bank_name;
	private String bank_acc_no;
	private String bank_branch;
	private double wallet_balance;
	
	
	@OneToOne(mappedBy = "userdetails")
	private LoginDetails logindetails;
	
	@OneToMany(mappedBy = "userTo")
	private List<TransactionDetails>  userToAccount;
	
	@OneToMany(mappedBy =  "userFrom")
	private List<TransactionDetails>  userFromAccount;
	
	
	@OneToMany(mappedBy = "userdetails")
	private List<SupportRequests> supportrequests;
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getUstate() {
		return ustate;
	}
	public void setUstate(String ustate) {
		this.ustate = ustate;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getBank_acc_no() {
		return bank_acc_no;
	}
	public void setBank_acc_no(String bank_acc_no) {
		this.bank_acc_no = bank_acc_no;
	}
	public String getBank_branch() {
		return bank_branch;
	}
	public void setBank_branch(String bank_branch) {
		this.bank_branch = bank_branch;
	}
	public double getWallet_balance() {
		return wallet_balance;
	}
	public void setWallet_balance(double wallet_balance) {
		this.wallet_balance = wallet_balance;
	}
	
	
	
	public LoginDetails getLogindetails() {
		return logindetails;
	}
	public void setLogindetails(LoginDetails logindetails) {
		this.logindetails = logindetails;
	}
	public List<TransactionDetails> getUserToAccount() {
		return userToAccount;
	}
	public void setUserToAccount(List<TransactionDetails> userToAccount) {
		this.userToAccount = userToAccount;
	}
	public List<TransactionDetails> getUserFromAccount() {
		return userFromAccount;
	}
	public void setUserFromAccount(List<TransactionDetails> userFromAccount) {
		this.userFromAccount = userFromAccount;
	}
	public List<SupportRequests> getSupportrequests() {
		return supportrequests;
	}
	public void setSupportrequests(List<SupportRequests> supportrequests) {
		this.supportrequests = supportrequests;
	}
	@Override
	public String toString() {
		return "UserDetails [user_id=" + user_id + ", user_name=" + user_name + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", contact_no=" + contact_no + ", Address=" + Address + ", city=" + city
				+ ", ustate=" + ustate + ", date_of_birth=" + date_of_birth + ", gender=" + gender + ", bank_name="
				+ bank_name + ", bank_acc_no=" + bank_acc_no + ", bank_branch=" + bank_branch + ", wallet_balance="
				+ wallet_balance + "]";
	}
	
}
