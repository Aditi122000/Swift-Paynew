package com.swiftpayapp.swiftpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {
	
	@RequestMapping(value = "home" , method = RequestMethod.GET)
	public String onClickHome() {
		return "dashboard";
	}
	
	
	@RequestMapping(value = "payment" , method = RequestMethod.GET)
	public String onClickPayment() {
		return "transaction";
	}
	
	@RequestMapping(value = "profile" , method = RequestMethod.GET)
	public String onClickProfile() {
		return "customerprofile";
	}
	
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
