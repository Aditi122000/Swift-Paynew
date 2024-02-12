package com.swiftpayapp.swiftpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserRegistrationController {
	
	@RequestMapping(value = "register" , method = RequestMethod.POST)
	public String ifRegisteredGoToLogin() {
		return "login";
	}

}
