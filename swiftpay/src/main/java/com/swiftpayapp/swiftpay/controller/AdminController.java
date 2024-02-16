package com.swiftpayapp.swiftpay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.swiftpayapp.swiftpay.entity.TransactionDetails;
import com.swiftpayapp.swiftpay.services.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value = "transactioner" , method = RequestMethod.GET)
	public String onclickTransactionForAdmin(Model model) {
		List<TransactionDetails> transactionss = adminService.transactionss();
		model.addAttribute("transactions",transactionss);
		return "admintransactionview";
		
		
	}
}
