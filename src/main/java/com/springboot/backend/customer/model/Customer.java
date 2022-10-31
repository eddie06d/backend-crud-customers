package com.springboot.backend.customer.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customer_id;
	
	private String company_name;
	private String contact_name;
	private String contact_title;
	private String address;
	private String city;
	private String region;
	private String postal_code;
	private String country;
	private String phone;
	private String fax;

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getContact_name() {
		return contact_name;
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

	public String getContact_title() {
		return contact_title;
	}

	public void setContact_title(String contact_title) {
		this.contact_title = contact_title;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}


	private static final long serialVersionUID = 1L;
	
}
