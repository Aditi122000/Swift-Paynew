package com.swiftpayapp.swiftpay.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swiftpayapp.swiftpay.entity.UserDetails;

@Repository
public interface UserDetailsRepo extends JpaRepository<UserDetails, Integer> {

	 UserDetails findByEmailAndPassword(String email, String password);
	 UserDetails findByEmail(String email);

}
