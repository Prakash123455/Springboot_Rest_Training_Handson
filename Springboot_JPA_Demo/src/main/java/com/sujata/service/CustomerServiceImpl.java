package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sujata.bean.Customer;
import com.sujata.bean.Item;
import com.sujata.persistence.CustomerDao;

@Service
@Transactional(readOnly=false)
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public List<Customer> getAllCustomer() {
		
		return customerDao.findAll();
	}

	@Override
	public boolean addCustomer(Customer customer) {
		Customer it=customerDao.save(customer);
		return it!=null;
		
		
	}

	@Override
	public boolean deleteCustomer(int id) {
		customerDao.deleteById(id);
		return true;
	}

	@Override
	public boolean updateCustomer(int id, Customer newCustomer) {

		customerDao.updateName(id, newCustomer.getCustomerName());
		return true;
	}

	
	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerDao.findById(id).get();
	}

	@Override
	public Void getCustomerSalarySlip(int id) {
		Customer cs=customerDao.findById(id).get();
		int GrossSalary=cs.getCustomerSalary();
		
		System.out.println("Basic Salary "+GrossSalary/2);
		System.out.println("House Rent "+GrossSalary/4);
		System.out.println("Professional Allowance "+GrossSalary/6);
		System.out.println("Leave Allowance  "+GrossSalary/4);
		return null;
	}

}
