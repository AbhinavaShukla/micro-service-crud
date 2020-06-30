package com.infy.bankingcrud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class BankingcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingcrudApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner DBInit() {
		return new DBInit();
	 }

}
