package com.cs.customer.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.cs.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	public Customer findByCustomerName(String customerName);
	


}