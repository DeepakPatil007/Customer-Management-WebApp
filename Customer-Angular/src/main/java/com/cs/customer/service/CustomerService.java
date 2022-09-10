package com.cs.customer.service;

import java.util.List;

import com.cs.customer.model.Customer;



public interface CustomerService {
public Customer addCustomer(Customer Customer);
	
	public Customer getCustomerById(int customerId);
	
	public boolean deleteCustomer(int customerId);
	
	public List<Customer> getAllCustomers();
	
	public Customer updateCustomer(Customer Customer);
	
	public Customer searchCustomerByName(String customerName);

}
