package com.swiftpayapp.swiftpay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.swiftpayapp.swiftpay.entity.TransactionDetails;
import com.swiftpayapp.swiftpay.entity.UserDetails;
import com.swiftpayapp.swiftpay.repositories.TransactionDetailsRepo;
import com.swiftpayapp.swiftpay.repositories.UserDetailsRepo;

@Service
public class DashboardService {
	
	@Autowired
	private TransactionDetailsRepo transactionDetailsRepo;
	
	@Autowired
	private UserDetailsRepo userdetailsRepo;
	
//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//  retrieveing all the transactions performed by user
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	
	public List<TransactionDetails> transactions(int userid){
		return transactionDetailsRepo.findTransctionsByUserId(userid);
	}
	
//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//  retrieveing all the details of the user
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	
	public List<UserDetails> userdetail(){
		return userdetailsRepo.findAll();
	}
	
//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//  deletion of acccount
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	public void deleteUser(UserDetails userDetails) {
		userdetailsRepo.delete(userDetails);
	}

}
