package com.swiftpayapp.swiftpay.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.swiftpayapp.swiftpay.services.TransactionService;

import jakarta.servlet.http.HttpSession;

@Controller
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@RequestMapping(value = "addMoney" , method = RequestMethod.GET)
	public String goToAddMoney() {
		return "addmoney";
	}
	
	@RequestMapping(value = "sendMoney" , method = RequestMethod.GET)
	public String goToSendMoney() {
		return "sendmoney";
	}
	
//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//  adding money
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	@RequestMapping(value = "addMoneyToWallet" , method = RequestMethod.POST )
	public String moneyAddedSuccess( @RequestParam double amount , Model model , HttpSession session) {
		try {
			String user=(String) session.getAttribute("email");
			transactionService.depositFunds(user, amount);
			return "addmoneysucess";
		}catch(Exception e) {
		    model.addAttribute("error", e.getMessage());
		    return "addmoney";
		  }
	}
	
	@RequestMapping(value = "moneysent" , method = RequestMethod.GET)
	public String retrunDashboardAfterAddition() {
		return "dashboard";
	}
	
//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//  sending the money from below controller
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	
	@RequestMapping(value = "sendMoneyToUser" , method = RequestMethod.POST)
	public String moneySentSucess( @RequestParam String recipientEmail , @RequestParam double amount, Model model,HttpSession session) {
		try {
			String from=(String) session.getAttribute("email");
		    transactionService.transferFunds(from, recipientEmail, amount);
		    return "sentsuccessful";
		  } catch (Exception e) {
		    model.addAttribute("error", e.getMessage());
		    return "sendmoney";
		  }

		
	}
	
	
	@RequestMapping(value ="dasboard" , method = RequestMethod.GET)
	public String returnDashboardAfterTransaction() {
		return "dashboard";
		
	}
	
}

	
//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//  
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	