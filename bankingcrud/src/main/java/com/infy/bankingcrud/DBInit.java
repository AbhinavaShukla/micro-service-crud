package com.infy.bankingcrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.infy.bankingcrud.domain.Account;
import com.infy.bankingcrud.domain.Customer;
import com.infy.bankingcrud.repository.AccountRepository;
import com.infy.bankingcrud.repository.CustomerRepository;


public class DBInit implements CommandLineRunner {

	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		 //Abhinava's details
		   Customer  abhinavaShukla = new Customer();
		   abhinavaShukla.setCustomerFName("Abhinava");
		   abhinavaShukla.setCustomerLName("Shukla");
		   abhinavaShukla.setEmail("abhinava123@gmail.com");
		   abhinavaShukla.setPhoneNumber("+610452623758");
		   abhinavaShukla.setAddressLine1("street 13 Mankapur");
		   abhinavaShukla.setAddressLine2("Gonda 271302");
		   abhinavaShukla = customerRepository.save(abhinavaShukla);
		   
		   
		 //Abhinava's account1
		   Account abhinava = new Account();
		   abhinava.setAccountNumber(10881061);
		   abhinava.setBalance(8000.00);
		   abhinava.setCustomer(abhinavaShukla);
		   accountRepository.save(abhinava);
		   
		 //Abhinava's account2 
		   Account abhinava1 = new Account();
		   abhinava1.setAccountNumber(10881069);
		   abhinava1.setBalance(12000.00);
		   abhinava1.setCustomer(abhinavaShukla);
		   accountRepository.save(abhinava1);
		   

		//Aditya's details
		   Customer  adityaShukla = new Customer();
		   adityaShukla.setCustomerFName("Aditya");
		   adityaShukla.setCustomerLName("Shukla");
		   adityaShukla.setEmail("aditya123@gmail.com");
		   adityaShukla.setPhoneNumber("+919835467235");
		   adityaShukla.setAddressLine1("26/11 Nawabganj");
		   adityaShukla.setAddressLine2("Kanpur 209305");
		   adityaShukla = customerRepository.save(adityaShukla);
		   
		   
		 //Aditya's account1
		   Account aditya = new Account();
		   aditya.setAccountNumber(10981061);
		   aditya.setBalance(8000.00);
		   aditya.setCustomer(adityaShukla);
		   accountRepository.save(aditya);
		   
		   
		 //Aditya's account2
		   Account aditya1 = new Account();
		   aditya1.setAccountNumber(10881059);
		   aditya1.setBalance(12000.00);
		   aditya1.setCustomer(adityaShukla);
		   accountRepository.save(aditya1);
		   
		   
		   
		   
		   
           

	}

}