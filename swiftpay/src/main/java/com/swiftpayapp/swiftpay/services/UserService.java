package com.swiftpayapp.swiftpay.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiftpayapp.swiftpay.entity.AdminLogin;
import com.swiftpayapp.swiftpay.entity.UserDetails;
import com.swiftpayapp.swiftpay.repositories.AdminLoginRepo;
import com.swiftpayapp.swiftpay.repositories.UserDetailsRepo;

@Service
public class UserService {
	
	@Autowired
	private UserDetailsRepo userDetailsRepo;
	
	@Autowired
	private AdminLoginRepo adminLoginRepo;
	
	public class InvalidLoginException extends RuntimeException {

		  public InvalidLoginException(String message) {
		    super(message); 
		  }
		  

		}

	//find user by email
	public UserDetails findByEmail(String email)
	{
		return userDetailsRepo.findByEmail(email);
	}
	
	
	//checking login validation for the user
	public Map<String, Object> loginValidation(String email, String password) {
		Map<String, Object> response = new HashMap<>();
		
//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//   validation for Admin
//  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		if(email.equals("admin@gmail.com") && password.equals("admin123")) {

			/* save hardcoded admin to db */
			
			  AdminLogin admin = new AdminLogin();
			  admin.setAdminId(1);
				/* admin.setRole("ADMIN"); */
			  admin.setEmail(email);
			  admin.setPassword(password);
			  adminLoginRepo.save(admin);
			  response.put("isValid" ,true);
			  response.put("role", "ADMIN");

			}else {
				
		 //this is for validating email	   
		if(email == null || email.isEmpty()) {
	      throw new InvalidLoginException("Email is required");
	    }

	    // Validate password
	    if(password == null || password.isEmpty()) {
	      throw new InvalidLoginException("Password is required");
	    }

	    // Find user by email
	    UserDetails user = userDetailsRepo.findByEmailAndPassword(email,password);

	    // Validate credentials
	    if(user != null && user.getPassword().equals(password)) {
	      response.put("isValid", true);
	      response.put("role", "USER");
	    }else {
	    	response.put("isValid", false);
	    }
	    }

	    return response;
	  }
	
//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//   method for registering the user in database and set method is use directly getting 500 rs as soon as users register
//  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------//

	public void register(UserDetails user) {
		user.setWallet_balance(500.0);
		userDetailsRepo.save(user);
	}
}


