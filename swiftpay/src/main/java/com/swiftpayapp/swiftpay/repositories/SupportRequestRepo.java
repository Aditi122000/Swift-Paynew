package com.swiftpayapp.swiftpay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swiftpayapp.swiftpay.entity.SupportRequests;

@Repository
public interface SupportRequestRepo extends JpaRepository<SupportRequests, Integer> {

}
