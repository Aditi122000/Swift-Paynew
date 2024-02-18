package com.swiftpayapp.swiftpay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.swiftpayapp.swiftpay.entity.TransactionDetails;
import com.swiftpayapp.swiftpay.repositories.TransactionDetailsRepo;

@Controller
public class SupportService {
	
	@Autowired
	private TransactionDetailsRepo transactionDetailsRepo;
	
	public TransactionDetails getTransactionById(int transactionid) {
		return transactionDetailsRepo.findById(transactionid).orElse(null);
	}

}
