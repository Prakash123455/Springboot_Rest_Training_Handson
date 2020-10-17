package com.sujata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@Column(name="CustomerId")
	private int customerId;
	@Column(name="CustomerName")
	private String customerName;
	@Column(name="CustomerDepartment")
	private String customerDepartment;
	@Column(name="CustomerAddress")
	private String customerAddress;
	@Column(name="CustomerSalary")
	private int customerSalary;
	
	public Customer(){
		
	}

	public Customer(int customerId, String customerName, String customerDepartment, String customerAddress,
			int customerSalary) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerDepartment = customerDepartment;
		this.customerAddress = customerAddress;
		this.customerSalary = customerSalary;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerDepartment() {
		return customerDepartment;
	}

	public void setCustomerDepartment(String customerDepartment) {
		this.customerDepartment = customerDepartment;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getCustomerSalary() {
		return customerSalary;
	}

	public void setCustomerSalary(int customerSalary) {
		this.customerSalary = customerSalary;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerDepartment="
				+ customerDepartment + ", customerAddress=" + customerAddress + ", customerSalary=" + customerSalary
				+ "]";
	}

}