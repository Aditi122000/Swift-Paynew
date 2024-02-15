package com.swiftpayapp.swiftpay.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiftpayapp.swiftpay.entity.TransactionDetails;
import com.swiftpayapp.swiftpay.entity.UserDetails;
import com.swiftpayapp.swiftpay.repositories.TransactionDetailsRepo;
import com.swiftpayapp.swiftpay.repositories.UserDetailsRepo;

@Service
public class TransactionService {
	
	@Autowired
	private UserDetailsRepo userDetailsRepo;
	
	@Autowired
	private TransactionDetailsRepo transactionDetailsRepo;
		
//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//  Transfer for funds to the user
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------//

	public void transferFunds(String fromEmail, String toEmail , double amount ) {
		
		//getting user details by email
		UserDetails fromUser = userDetailsRepo.findByEmail(fromEmail);
		UserDetails  toUserDetails = userDetailsRepo.findByEmail(toEmail);
		
		//creating the transaction
	    TransactionDetails transaction = new TransactionDetails();

		
		// Set date
	    transaction.setTransactionDate(new Date());

	    // Set amount
	    transaction.setAmount(amount);  
	}

}
