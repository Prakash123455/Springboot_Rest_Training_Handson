package com.sujata.presentation;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.bean.Customer;
import com.sujata.service.CustomerService;
import com.sujata.util.CustomerHelper;

@Component("customerUi")
public class CustomerUIImpl implements CustomerUI {

	@Autowired
	private CustomerService customerService;
	
	
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	@Override
	public void showMenu() {
		System.out.println("1. Add Customer");
		System.out.println("2. Show All Customer");
		System.out.println("3. Search Customer");
		System.out.println("4. Delete Customer");
		System.out.println("5. Update Customer");
		System.out.println("6. Generate Salary Slip");
		System.out.println("7. Exit");

	}

	@Override
	public void perform(int choice) {
		Scanner sc=new Scanner(System.in);
		switch (choice) {
		case 1:
			Customer customer=CustomerHelper.getCustomer();
			if(customerService.addCustomer(customer))
				System.out.println("Customer Added!!");
			else
				System.out.println("Customer not Added!!");
			break;
		case 2:
			List<Customer> customers=customerService.getAllCustomer();
			for(Customer customer1:customers){
				System.out.println(customer1);
			}
			break;
		case 3:
			System.out.println("Enter Customer Id to be searched for :");
			int customerId=sc.nextInt();
			Customer customer2=customerService.getCustomer(customerId);
			if(customer2!=null)
				System.out.println(customer2);
			else
				System.out.println("Customer not found");
			break;
		case 4:
			System.out.println("Enter Customer Id to be deleted : ");
			int id=sc.nextInt();
			if(customerService.deleteCustomer(id))
				System.out.println("Customer Deleted");
			else
				System.out.println("Customer Not Deleted");
			break;
		case 5:
			System.out.println("Enter Customer ID whoes values you want to update : ");
			int customerNo=sc.nextInt();
			Customer newCustomer=CustomerHelper.getCustomerforUpdate(customerNo);
			if(customerService.updateCustomer(customerNo, newCustomer))
				System.out.println("Customer Updated");
			else
				System.out.println("Customer Not Updated");
			break;
		case 6:
			System.out.println("Enter Customer ID whose salary slip you want: ");
			int customerNo_=sc.nextInt();
			customerService.getCustomerSalarySlip(customerNo_);
			break;
		case 7:
			System.out.println("Good Bye!!!");
			System.exit(0);

		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

}
