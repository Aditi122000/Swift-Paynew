package com.swiftpayapp.swiftpay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.swiftpayapp.swiftpay.entity.UserDetails;
import com.swiftpayapp.swiftpay.repositories.UserDetailsRepo;
import com.swiftpayapp.swiftpay.services.UserService;

@Controller
public class UserRegistrationController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "register" , method = RequestMethod.POST)
	public String ifRegisteredGoToLogin(@ModelAttribute("userreg") UserDetails user) {
		userService.register(user);
		return "login";
	}

}
