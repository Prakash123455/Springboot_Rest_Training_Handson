package com.sujata.service;

import java.util.List;

import com.sujata.bean.Customer;




public interface CustomerService {

	List<Customer> getAllCustomer();
	boolean addCustomer(Customer customer);
	boolean deleteCustomer(int id);
	boolean updateCustomer(int id,Customer newCustomer);
	Customer getCustomer(int id);
	Void getCustomerSalarySlip(int id);
}
