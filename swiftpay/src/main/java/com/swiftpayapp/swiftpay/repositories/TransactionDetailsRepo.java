package com.swiftpayapp.swiftpay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swiftpayapp.swiftpay.entity.TransactionDetails;

@Repository
public interface TransactionDetailsRepo extends JpaRepository<TransactionDetails, Integer>{

}
