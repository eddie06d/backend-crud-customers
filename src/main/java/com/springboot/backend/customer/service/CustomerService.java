package com.springboot.backend.customer.service;

import java.util.List;

import com.springboot.backend.customer.model.Customer;

public interface CustomerService {
	public Customer save(Customer customer);
	
	public void delete(Integer id);
	
	public Customer findById(Integer id);
	
	public List<Customer> findAll();
}
