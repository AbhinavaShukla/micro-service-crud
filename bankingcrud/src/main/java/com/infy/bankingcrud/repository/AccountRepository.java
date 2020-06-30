package com.infy.bankingcrud.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.bankingcrud.domain.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
	Page<Account> findByCustomerCustomerId(Integer customerId, Pageable pageable);
}
