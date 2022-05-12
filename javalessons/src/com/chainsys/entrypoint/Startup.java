package com.chainsys.entrypoint;

import com.chainsys.classandmethods.Book;
import com.chainsys.classandmethods.Employee;
import com.chainsys.classandmethods.MultipleCatch;
import com.chainsys.datelessons.WorkingWithDate;
import com.chainsys.linkedlist.SetTreeSetDemo;
import com.chainsys.strings.StringBuilderDemo;
import com.chainsys.strings.StringLessonA;
import com.chainsys.unittest.BankTest;
import com.chainsys.unittest.BankTester;
import com.chainsys.unittest.BookTester;
import com.chainsys.unittest.CalculatorTester;
import com.chainsys.unittest.CarTester;
import com.chainsys.unittest.Emptest;
import com.chainsys.unittest.TestCustomer;
import com.chainsys.unittest.TestPolymorphism;
import com.chainsys.unittest.TestVehicle;
import com.chainsys.unittest.VariableTester;
import com.chainsys.variables.Bank1;
import com.chainsys.variables.Calculator;
import com.chainsys.classandmethods.Employee;
import com.chainsys.reflection.ListClassMembers;

public class Startup {
	/***
	 * purpose portable executable entry point for the lessons
	 * @param args type String
	 * @return 
	 */
	public static void main(String[] args) {
		//VariableTester.testGlobalVariable();
		//CalculatorTester.testAdd();
		//BankTester.testaccountNumber();
		//BankTester.testdeposit();
		//BankTester.testopenAccount();
		//BankTester.testwithdrawl();
		//Emptest.testEmpName();
		//Emptest.testCity();
		//Emptest.testSalary();
		//CarTester.testCar();
		//BookTester.testBook();
		//StringLessonA.reverse();
		//StringBuilderDemo.testA();
		//WorkingWithDate.displayDOB();
		//BankTest.testBank();
		//MultipleCatch.m4();
		//TestPolymorphism.testPolymorphism();
		//TestVehicle.testVehicle();
		//ListClassMembers.lateBinding();
		//ListClassMembers.queryTypeInfo();
		ListClassMembers.testsetAccessible();
		//SetTreeSetDemo.demoA();
	}
}