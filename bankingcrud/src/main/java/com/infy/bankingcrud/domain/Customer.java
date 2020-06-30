package com.infy.bankingcrud.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="CUSTOMER")
@Entity
public class Customer implements Serializable{
	
	private static final long serialVersionUID = -6759774343110776659L;

	@Id
	@GeneratedValue
	@Column(name="CUSTOMERID",updatable = false)
	private Integer customerId;
	
	@Column(name="FNAME")
	private String customerFName;
	
	@Column(name="LNAME")
	private String customerLName;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PHONENUMBER")
	private String phoneNumber;
	
	@Column(name="ADDRESSLINE1")
	private String addressLine1;
	
	@Column(name="ADDRESSLINE2")
	private String addressLine2;
	
	

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFName() {
		return customerFName;
	}

	public void setCustomerFName(String customerFName) {
		this.customerFName = customerFName;
	}

	public String getCustomerLName() {
		return customerLName;
	}

	public void setCustomerLName(String customerLName) {
		this.customerLName = customerLName;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	
	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	
	

}
