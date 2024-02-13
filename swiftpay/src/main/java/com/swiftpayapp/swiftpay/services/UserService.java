package com.swiftpayapp.swiftpay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiftpayapp.swiftpay.entity.UserDetails;
import com.swiftpayapp.swiftpay.repositories.UserDetailsRepo;

@Service
public class UserService {
	
	@Autowired
	private UserDetailsRepo userDetailsRepo;
	
	public class InvalidLoginException extends RuntimeException {

		  public InvalidLoginException(String message) {
		    super(message); 
		  }

		}

	
	
	//checking login validation for the user
	public boolean loginValidation(String email, String password) {
		
		
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
	      return true;
	    }

	    return false;
	  }
	
	

	// method for registering the user in database
	public void register(UserDetails user) {
		userDetailsRepo.save(user);
	}
}


