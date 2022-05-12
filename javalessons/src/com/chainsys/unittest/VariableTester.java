package com.chainsys.unittest;

import com.chainsys.variables.DemoA;

public class VariableTester {
	private static String DataA;
	public static void testGlobalVariable() {
		
		System.out.println("DataA: " + DemoA.DataA);
		//System.out.println("DataB: " + DemoA.DataB);
		System.out.println("DataC: " + DemoA.DataC);
		//DemoA.DataA=2345;
		}
	public static void testImmutablevariable() {
		
		/* cannot make a static reference to the non static field Demo
		 */// DemoA.DataB=123;
		//**
		/* first create an object or the class
		 * pass an int value as an argument to the constructor
		 * access the immutable instance field using the object reference
		 */
			DemoA firstObject=new DemoA(123);
			System.out.println(firstObject.DataB);
			/**
			 * value assigned to the immutable field can not be changed
			 * value for the immutable field can be assigned only through the constructor
			 **/
			//firstOBject.DataB=567;
		/**
		 * calling static method using class name
		 * without creating an object
		 * created on: 25 march 2022
		 */
	}
	public static void testStaticMethod()
	{
		DemoA.sayHello();
	}
	/**
	 * calling non static method using object reference
	 * without creating an object, non static methods can not be called
	 * created on :25 march 2022
	 */ 
	public static void testNonStaticMethod() {
		//ERROR
		// DemoA.greetUser();
		DemoA firstObject=new DemoA(111);
		// call the non static method
		firstObject.greetUser();
	}
	
}
