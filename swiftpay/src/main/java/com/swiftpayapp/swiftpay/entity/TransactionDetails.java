package com.swiftpayapp.swiftpay.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class TransactionDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "transactionid_generator")
    @SequenceGenerator(name = "transactionid_generator",initialValue = 1,allocationSize = 1,sequenceName = "transactionid_seq")
	private int transactionid;
	private LocalDate transaction_date;
	private double transaction_amount;
	
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
	
	public LocalDate getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(LocalDate transaction_date) {
		this.transaction_date = transaction_date;
	}
	public double getTransaction_amount() {
		return transaction_amount;
	}
	public void setTransaction_amount(double transaction_amount) {
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
