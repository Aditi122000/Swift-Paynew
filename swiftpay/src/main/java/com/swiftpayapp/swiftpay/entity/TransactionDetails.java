package com.swiftpayapp.swiftpay.entity;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class TransactionDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int transactionid;
	private Date transaction_date;
	private Date transaction_amount;
	
	@ManyToOne
	@JoinColumn(name="transferred_from_userid")
	private UserDetails userFrom ;
	
	@ManyToOne
	@JoinColumn (name="transferred_to_userid")
	private UserDetails userTo ;
	
	
	
	
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	
	public Date getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}
	public Date getTransaction_amount() {
		return transaction_amount;
	}
	public void setTransaction_amount(Date transaction_amount) {
		this.transaction_amount = transaction_amount;
	}
	public UserDetails getUserFrom() {
		return userFrom;
	}
	public void setUserFrom(UserDetails userFrom) {
		this.userFrom = userFrom;
	}
	public UserDetails getUserTo() {
		return userTo;
	}
	public void setUserTo(UserDetails userTo) {
		this.userTo = userTo;
	}
	
	
	

}
