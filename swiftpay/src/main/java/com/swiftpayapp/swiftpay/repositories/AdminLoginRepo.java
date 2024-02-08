package com.swiftpayapp.swiftpay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swiftpayapp.swiftpay.entity.AdminLogin;


@Repository
public interface AdminLoginRepo extends JpaRepository<AdminLogin, Integer>{

}
