package com.swiftpayapp.swiftpay.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.swiftpayapp.swiftpay.entity.TransactionDetails;


@Repository
public interface TransactionDetailsRepo extends JpaRepository<TransactionDetails, Integer>{

	@Query("select t  from TransactionDetails t where t.userFrom.user_id=?1" )
	List<TransactionDetails> findTransctionsByUserId(int userid);
	
}
