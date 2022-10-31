package com.springboot.backend.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.backend.customer.dao.CustomerDao;
import com.springboot.backend.customer.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	
	@Override
	@Transactional(readOnly = false)
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.save(customer);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		customerDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Customer findById(Integer id) {
		// TODO Auto-generated method stub
		return customerDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerDao.findAll();
	}
	
}
