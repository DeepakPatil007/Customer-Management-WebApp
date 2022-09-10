package com.cs.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cs.customer.model.Customer;
import com.cs.customer.repository.CustomerRepository;

@Service
public class CustomerServiceImplementation implements CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	@Override
	public Customer addCustomer(Customer Customer) {
		return repo.save(Customer);
	}

	@Override
	public Customer getCustomerById(int CustomerId) {
		return repo.findById(CustomerId).get();
	}

	@Override
	public boolean deleteCustomer(int CustomerId) {
	repo.deleteById(CustomerId);
	return !repo.existsById(CustomerId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

	@Override
	public Customer updateCustomer(Customer Customer) {
		return repo.save(Customer);
	}
	
	public Customer searchCustomerByName(String customerName) {
		return repo.findByCustomerName(customerName);
	}

}
