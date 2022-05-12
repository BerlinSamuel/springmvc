package com.chainsys.unittest;
import com.chainsys.variables.Bank1;
public class BankTester {
	
	public static void testopenAccount() {
		String customerName="SAMUEL";
		String str=Bank1.openAccount(customerName);
		System.out.println("Name of the Customer:" +str);
		}
	public static void testaccountNumber() {
		int acc=1234567;
		int accNumber=Bank1.accountNumber(acc);
		System.out.println("Customer Account Number:" +accNumber);
	}
	public static void testdeposit() {
		int d=50000;
		int deposit=Bank1.deposit(d);
		System.out.println("Deposited Amount:"+deposit);
	}
	public static void testwithdrawl() {
		int w=1000;
		int withdraw=Bank1.withdrawl(w);
		System.out.println("Withdrawl Amount:"+ withdraw);		
	}

}
