package com.swiftpayapp.swiftpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TransactionController {
	
	@RequestMapping(value = "addMoney" , method = RequestMethod.GET)
	public String goToAddMoney() {
		return "addmoney";
	}
	
	@RequestMapping(value = "sendMoney" , method = RequestMethod.GET)
	public String goToSendMoney() {
		return "sendmoney";
	}
	
	@RequestMapping(value = "sendMoneyToUser" , method = RequestMethod.POST)
	public String moneySentSucess() {
		return "moneysentsuccess";
	}
}
