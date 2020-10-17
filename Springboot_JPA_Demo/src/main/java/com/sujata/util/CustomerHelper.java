package com.sujata.util;

import java.util.Scanner;

import com.sujata.bean.Customer;

public class CustomerHelper {

	public static Customer getCustomer(){
		Scanner sc=new Scanner(System.in);
		Customer customer=new Customer();
		System.out.println("Enter Customer Id : ");
		customer.setCustomerId(sc.nextInt());
		System.out.println("Enter Customer Name : ");
		customer.setCustomerName(sc.next());
		System.out.println("Enter Customer Department : ");
		customer.setCustomerDepartment(sc.next());
		System.out.println("Enter Customer Address : ");
		customer.setCustomerAddress(sc.next());
		System.out.println("Enter Customer Salary : ");
		customer.setCustomerSalary(sc.nextInt());
		return customer;
	}
	
	public static Customer getCustomerforUpdate(int id){
		Scanner sc=new Scanner(System.in);
		Customer customer=new Customer();
		customer.setCustomerId(id);
		System.out.println("Enter Customer Id : ");
		customer.setCustomerId(sc.nextInt());
		System.out.println("Enter Customer Name : ");
		customer.setCustomerName(sc.next());
		System.out.println("Enter Customer Department : ");
		customer.setCustomerDepartment(sc.next());
		System.out.println("Enter Customer Address : ");
		customer.setCustomerAddress(sc.next());
		System.out.println("Enter Customer Salary : ");
		customer.setCustomerSalary(sc.nextInt());
		return customer;
	}
}
