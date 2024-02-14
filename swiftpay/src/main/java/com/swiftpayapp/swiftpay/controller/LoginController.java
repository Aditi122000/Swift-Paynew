package com.swiftpayapp.swiftpay.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.swiftpayapp.swiftpay.services.UserService;
import com.swiftpayapp.swiftpay.services.UserService.InvalidLoginException;


@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "login" , method = RequestMethod.GET)
	public String startLogin() {
		return "login";	
	}

	@RequestMapping(value = "login" , method = RequestMethod.POST)
	public String goToDashboard(@RequestParam String email, @RequestParam String password , ModelMap model) {
		
		try {
		      Map<String, Object> loginResult = userService.loginValidation(email, password);

		      if((boolean) loginResult.get("isValid")) {
		    	  String role= (String) loginResult.get("role");
		        if(role.equals("ADMIN")) {
		        	return "admindashboard";
		        }else {
		        	return "dashboard";
		        }
		      } else {
		        model.addAttribute("error", "Invalid credentials");
		        return "login";
		      }

		    } catch (InvalidLoginException e) {
		      model.addAttribute("error", e.getMessage());
		      return "login";
		    }	
		
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
