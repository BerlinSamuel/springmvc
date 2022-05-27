package com.chainsys.unittest;
import com.chainsys.variables.Calculator;

/**
 * This class is for unit testing the calculator class and its methods
 * Methods to test.
 * <list>
 * add(param1,param2)
 * multiply(param1,param2)
 * subtract(param1,param2)
 * divide(param1,param2)
 * @author Chainsys Venkat
 *
 */
public class CalculatorTester {
	public static void testAdd()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.add(arg1, arg2);
		System.out.println("Result of Add is :"+output);
		}
		public static void testMultiply() {
			int arg1=100;
			int arg2=50;
			int output=Calculator.multiply(arg1, arg2);
			System.out.println("Result of Add is :"+output);
			}
		public static void testDivide() {
			int arg1=100;
			int arg2=50;
			int output=Calculator.divide(arg1, arg2);
			System.out.println("Result of Add is :"+output);
			}
		}