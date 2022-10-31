package com.springboot.backend.customer.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.backend.customer.model.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer> {
	
}
