package com.infy.bankingcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.bankingcrud.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
