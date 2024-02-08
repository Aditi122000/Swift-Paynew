package com.swiftpayapp.swiftpay;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.swiftpayapp.swiftpay.entity.UserDetails;
import com.swiftpayapp.swiftpay.repositories.UserDetailsRepo;

@SpringBootApplication
@ComponentScan("com")
class SwiftpayApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SwiftpayApplication.class, args);
		UserDetailsRepo udRepo = context.getBean(UserDetailsRepo.class);
		
		  UserDetails ut = new UserDetails(); ut.setUser_name("lost02");
		  ut.setFirst_name("Prajna"); ut.setLast_name("Bhunia");
		  ut.setContact_no("899999999"); ut.setAddress("Laketown");
		  ut.setCity("Kolkata"); ut.setUstate("West Bengal");
			/* ut.setDate_of_birth("28/06/2000"); */ ut.setGender('F');
		  ut.setBank_name("Dummy Bank"); ut.setBank_acc_no("6120001500537282");
		  ut.setBank_branch("Laketown");
		 
		
		udRepo.save(ut);
		
		/*
		 * List<UserDetails> list = (List<UserDetails>)udRepo.findAll();
		 * list.forEach(user -> System.out.println(user));
		 * 
		 * UserDetails ut = udRepo.findById(302).get(); System.out.println(ut);
		 */		
		
		System.out.println("Updatedd");
		
		
		
		
	}

}
