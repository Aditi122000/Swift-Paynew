package com.swiftpayapp.swiftpay.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {
	
	
	@RequestMapping(value = "login" , method = RequestMethod.GET)
	public String startLogin() {
		return "login";	
	}

	@RequestMapping(value = "login" , method = RequestMethod.POST)
	public String goToDashboard() {
		return "dashboard";	
	}
	
	@RequestMapping(value = "forgot" , method = RequestMethod.GET)
	public String goToForgotPassword() {
		return "forgotpassword";
	}
	
	@RequestMapping(value = "signup" , method = RequestMethod.GET)
	public String goToSignUpIfNotRegistered() {
		return "userregistration";
		
	}


}
