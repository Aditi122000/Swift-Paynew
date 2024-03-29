package com.swiftpayapp.swiftpay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.swiftpayapp.swiftpay.entity.TransactionDetails;
import com.swiftpayapp.swiftpay.entity.UserDetails;
import com.swiftpayapp.swiftpay.services.DashboardService;
import com.swiftpayapp.swiftpay.services.SupportService;
import com.swiftpayapp.swiftpay.services.TransactionService;
import com.swiftpayapp.swiftpay.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@Controller
public class DashboardController {
	
	@Autowired
	private DashboardService dashboardservice;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private TransactionService transactionService;
	
	@RequestMapping(value = "home" , method = RequestMethod.GET)
	public String onClickHome() {
		return "dashboard";
	}
//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//  this is for handling support request trying to capture transaction id from view 
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	@RequestMapping(value = "customer-support/{transactionid}" , method = RequestMethod.GET)
	public String onClickRiseRequest(@PathVariable("transactionid") int transactionid , Model model) {
		
		return "support";
	}
	


	
	
//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//  calling the method of dashboard service to find all transaction and passing it to view 
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------//

	
	@RequestMapping(value = "paymentHistory" , method = RequestMethod.GET)
	public String onClickPayment(Model model,HttpSession session) {
		String email=(String) session.getAttribute("email");
		UserDetails userDetails=userService.findByEmail(email);
		int userid=userDetails.getUser_id();
		List<TransactionDetails> transactions = dashboardservice.transactions(userid);
		model.addAttribute("transactions", transactions);
		return "paymenthistory";
	}


//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//   calling the method of dashboard service to find all userdetail and passing it to view
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	
	@RequestMapping(value = "/profile" , method = RequestMethod.GET)
	public String onClickProfile(Model model) {
	List<UserDetails> userdetail = dashboardservice.userdetail();
	model.addAttribute("userdetail" , userdetail);
		return "customerprofile";
	}
	
//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//  
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------//

	
	@RequestMapping(value = "logout" , method = RequestMethod.GET)
	public String onClickLogout() {
		return "logout";
	}

//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//   deletion of account from userService
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------//

	
	@RequestMapping(value = "deleteAccount",  method = {RequestMethod.GET, RequestMethod.POST})
	public String onClickDeleteAccount(HttpSession session) {
	    String email = (String) session.getAttribute("email");
	    UserDetails userDetails = userService.findByEmail(email);
	    dashboardservice.deleteUser(userDetails); 
	    return "deleted"; 
	}
	
	
	
	@RequestMapping(value = "editProfile" , method = RequestMethod.GET)
	public String onClickEditProfile() {
		return "editprofile";
	}
	
	@RequestMapping(value = "starttransaction" , method = RequestMethod.GET)
	public String onClickStartTransaction() {
		return "starttransaction";
	}
	
	@RequestMapping(value = "/backhome" , method = RequestMethod.GET)
	public String onClickBackHone() {
		return "dashboard";
	}
	
//	@RequestMapping(value = "customer-support" , method = RequestMethod.GET)
//	public String onClickRaiseSupportRequest() {
//		return "customersupportrequest";
//	}
//	
	

	
}
