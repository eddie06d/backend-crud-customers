package com.springboot.backend.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.customer.model.Customer;
import com.springboot.backend.customer.service.CustomerService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/customers")
	public Customer save(@RequestBody Customer customer) {
		return customerService.save(customer);
	}
	
	@GetMapping("/customers")
	public List<Customer> findAll() {
		return customerService.findAll();
	}
	
	@GetMapping("/customers/{id}")
	public Customer findById(@PathVariable Integer id) {
		return customerService.findById(id);
	}
	
	@PutMapping("/customers/{id}")
	public Customer update(@RequestBody Customer customer, @PathVariable Integer id) {
		Customer currentCustomer = customerService.findById(id);
		
		currentCustomer.setCompany_name(customer.getCompany_name());
		currentCustomer.setContact_name(customer.getContact_name());
		currentCustomer.setContact_title(customer.getContact_title());
		currentCustomer.setAddress(customer.getAddress());
		currentCustomer.setCity(customer.getCity());
		currentCustomer.setRegion(customer.getRegion());
		currentCustomer.setPostal_code(customer.getPostal_code());
		currentCustomer.setCountry(customer.getCountry());
		currentCustomer.setPhone(customer.getPhone());
		currentCustomer.setFax(customer.getFax());
		
		return customerService.save(currentCustomer);
	}
	
	@DeleteMapping("/customers/{id}")
	public void delete(@PathVariable Integer id) {
		customerService.delete(id);
	}
}
