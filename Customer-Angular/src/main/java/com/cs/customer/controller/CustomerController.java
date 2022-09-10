package com.cs.customer.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cs.customer.model.Customer;
import com.cs.customer.service.CustomerService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
	
	@Autowired
	private CustomerService service;

	@PostMapping("/Customers")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Customer addCustomer(@RequestBody Customer Customer) {
		
		return service.addCustomer(Customer);
	}
	
	@GetMapping("/Customers/{id}")
	public Customer getCustomerById(@PathVariable("id") int customerId) {
		return service.getCustomerById(customerId);
	}
	
	@DeleteMapping("/Customers/{id}")
	public boolean deleteCustomer(@PathVariable("id") int customerId) {
		return service.deleteCustomer(customerId);
	}
	
	@GetMapping("/Customers")
	public List<Customer> getAllCustomers(){
		return service.getAllCustomers();
		
	}
	
	@PutMapping("/Customers")
	public Customer updateCustomer(@RequestBody Customer Customer) {
		return service.updateCustomer(Customer);
	}
	
	@GetMapping("/Customers/name/{CustomerName}")
	public Customer getCustomerByName(@PathVariable String customerName) {
		return service.searchCustomerByName(customerName);
	}
	
	
}