package com.swiftpayapp.swiftpay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiftpayapp.swiftpay.entity.TransactionDetails;
import com.swiftpayapp.swiftpay.repositories.TransactionDetailsRepo;

@Service
public class AdminService {
	
	@Autowired
	private TransactionDetailsRepo transactionDetailsRepo;
	
	public List<TransactionDetails> transactionss(){
		return transactionDetailsRepo.findAll();
	}

}
