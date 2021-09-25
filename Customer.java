package firstProject;

import java.util.Scanner;

class Customer
{
	 private String customerName;
	 private String accountId;
	 private String phoneno;
	 private String address;
	 
	public Customer(String customerName, String accountId, String phoneno, String address) {
		this.customerName = customerName;
		this.accountId = accountId;
		this.phoneno = phoneno;
		this.address = address;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 
}
