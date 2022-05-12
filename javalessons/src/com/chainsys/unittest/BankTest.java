package com.chainsys.unittest;
import com.chainsys.classandmethods.Branch;
import com.chainsys.classandmethods.CustomerAccountDetails;
import com.chainsys.classandmethods.Person;
public class BankTest {
	public static void testBank() {
			Branch branch = new Branch(57);
			branch.setLocation("Thirumangalam");
			branch.setManagerId(3129);
			System.out.println("Bank_Name: "+Branch.getBankName());
			System.out.println("Branch_Id: "+branch.getId());
			System.out.println("Branch_Manager_Id: "+branch.getManagerId());
			CustomerAccountDetails customer = new CustomerAccountDetails(15, 1010006578);
			customer.setAccount_type("Savings");
			customer.setCurrent_balance(50000);
			System.out.println("Customer_Id: "+customer.getCustomer_id());
			System.out.println("Account_Number: "+customer.getAccount_number());
			System.out.println("Account_type: "+customer.getAccount_type());
			System.out.println("Balance_Amount: "+customer.getCurrent_balance());
			Person employee = new Person(3129);
			employee.setName("BERLIN SAMUEL R");
			employee.setAddress("20/5C 2Mokkayambalam Nagar, Sholavanthan Road, Thirumanagalam.Madurai-625706");
			employee.setPhone_number(9597385762L);
			employee.setE_mail_address("berlinsamuel.robertrajasingh@chainsys.com");
			System.out.println("Employee_Name: "+employee.getName());
			System.out.println("Employee_Address: "+employee.getAddress());
			System.out.println("Employee_Ph_No: "+employee.getPhone_number());
			System.out.println("Employee_Mail: "+employee.getE_mail_address());
			}
}