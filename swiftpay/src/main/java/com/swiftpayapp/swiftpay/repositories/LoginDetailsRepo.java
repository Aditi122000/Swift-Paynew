package com.swiftpayapp.swiftpay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swiftpayapp.swiftpay.entity.LoginDetails;

@Repository
public interface LoginDetailsRepo extends JpaRepository<LoginDetails, Integer> {

}
