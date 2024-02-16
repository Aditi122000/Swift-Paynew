package com.swiftpayapp.swiftpay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.swiftpayapp.swiftpay.entity.TransactionDetails;
import com.swiftpayapp.swiftpay.entity.UserDetails;
import com.swiftpayapp.swiftpay.services.DashboardService;
import com.swiftpayapp.swiftpay.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class DashboardController {
	
	@Autowired
	private DashboardService dashboardservice;
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "home" , method = RequestMethod.GET)
	public String onClickHome() {
		return "dashboard";
	}
	
	
	
//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//  soritng functionality 
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------//

	@RequestMapping(value = "/payment", method = RequestMethod.POST)
	public String sortTransactionsByDateAsc(@RequestParam String sort,Model model) {
	    List<TransactionDetails> transactions = dashboardservice.getSortedTransactionsByDateAsc(sort);
	    for(TransactionDetails t:transactions)
	    {
	    	System.out.println(t.getTransaction_date());
	    }
	    model.addAttribute("transactions", transactions);
	    return "paymenthistory";
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
	
	
	@RequestMapping(value = "profile" , method = RequestMethod.GET)
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
		return "login";
	}
	
	/* need to add functionality to this
	 * @RequestMapping(value = "deleteAccount" , method = RequestMethod.GET) public
	 * String onClickDeleteAccount() { return "deleted"; }
	 */
	
	
	
	@RequestMapping(value = "editProfile" , method = RequestMethod.GET)
	public String onClickEditProfile() {
		return "editprofile";
	}
	
	@RequestMapping(value = "starttransaction" , method = RequestMethod.GET)
	public String onClickStartTransaction() {
		return "starttransaction";
	}
	
	@RequestMapping(value = "raiseSupportRequest" , method = RequestMethod.GET)
	public String onClickRaiseSupportRequest() {
		return "customersupportrequest";
	}
	
	

	
}
