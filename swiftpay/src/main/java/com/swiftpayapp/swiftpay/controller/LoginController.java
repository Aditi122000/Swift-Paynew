package com.swiftpayapp.swiftpay.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.swiftpayapp.swiftpay.entity.UserDetails;
import com.swiftpayapp.swiftpay.services.UserService;
import com.swiftpayapp.swiftpay.services.UserService.InvalidLoginException;

import jakarta.servlet.http.HttpSession;


@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "login" , method = RequestMethod.GET)
	public String startLogin() {
		return "login";	
	}

	@RequestMapping(value = "login" , method = RequestMethod.POST)
	public String goToDashboard(@RequestParam String email, @RequestParam String password , ModelMap model,HttpSession session) {
		
		try {
		      Map<String, Object> loginResult = userService.loginValidation(email, password);
		      	UserDetails objDetails=userService.findByEmail(email);
		      if((boolean) loginResult.get("isValid")) {
		    	  String role= (String) loginResult.get("role");
		        if(role.equals("ADMIN")) {
		        	return "admindashboard";
		        }else {
		        	session.setAttribute("email", email);
		        	model.addAttribute("name",objDetails.getFirst_name());
		        	model.addAttribute("balance",objDetails.getWallet_balance());
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

	
	
	
	@RequestMapping(value = "signup" , method = RequestMethod.GET)
	public String goToSignUpIfNotRegistered() {
		return "userregistration";
		
	}


}
