package com.swiftpayapp.swiftpay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		/* UserDetails fromUser = userDetailsRepo.findByEmail(fromEmail); */
	}

}
