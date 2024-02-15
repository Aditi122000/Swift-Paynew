package com.swiftpayapp.swiftpay.services;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiftpayapp.swiftpay.entity.TransactionDetails;
import com.swiftpayapp.swiftpay.entity.UserDetails;
import com.swiftpayapp.swiftpay.repositories.TransactionDetailsRepo;
import com.swiftpayapp.swiftpay.repositories.UserDetailsRepo;

import jakarta.transaction.Transactional;

@Service
public class TransactionService {
	
	@Autowired
	private UserDetailsRepo userDetailsRepo;
	
	@Autowired
	private TransactionDetailsRepo transactionDetailsRepo;
		
//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//  money transfer to the user
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	@Transactional
	public void transferFunds(String fromUserEmail ,String toUserEmail , double amount) {
		
		  // 1. Find sender and receiver user details
	    UserDetails fromUser = userDetailsRepo.findByEmail(fromUserEmail);
	    UserDetails toUser = userDetailsRepo.findByEmail(toUserEmail);
	    
	     // 2. Validate sender has enough balance
			
			/*
			 * if(fromUser.getWallet_balance() < amount) { throw new
			 * InsufficientBalanceException(); }
			 */			 

	     // 3. Debit amount from sender's wallet
	    fromUser.setWallet_balance(fromUser.getWallet_balance() - amount);
	    
	     // 4. Credit amount to receiver's wallet
	    toUser.setWallet_balance(toUser.getWallet_balance() + amount);
	    
	     // 5. Save updated user details
	    userDetailsRepo.save(fromUser);
	    userDetailsRepo.save(toUser);
	    
	     // 6. Create transaction details object 
	    TransactionDetails transaction = new TransactionDetails();

	     // 7. Set sender, receiver, amount in transaction
	    transaction.setUserFrom(fromUser);
	    transaction.setUserTo(toUser);
	    transaction.setTransaction_amount(amount);
	    
	     // 8. Set transaction date
	    transaction.setTransaction_date(LocalDate.now());

	     // 9. Save transaction details
	    transactionDetailsRepo.save(transaction); 

	}
	
//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//   money adding to the wallet
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	@Transactional
	public void depositFunds(String userEmail , double amount) {
		
		// Get user
		UserDetails user = userDetailsRepo.findByEmail(userEmail);
		
		/*
		 * // Validate user exists if(user == null) { throw new UserNotFoundException();
		 * }
		 */
		
		 user.setWallet_balance(user.getWallet_balance() + amount);
		  userDetailsRepo.save(user);

		// Create transaction
		    TransactionDetails transaction = new TransactionDetails();

		    // Set transaction details
		    transaction.setTransaction_date(LocalDate.now());
		    transaction.setTransaction_amount(amount);
		    transaction.setUserFrom(null); // deposit, no 'from' user
		    transaction.setUserTo(user); 

		    // Save transaction
		    transactionDetailsRepo.save(transaction);

		  

	}
	
}


