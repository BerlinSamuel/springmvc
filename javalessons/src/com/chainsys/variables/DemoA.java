package com.chainsys.variables;

public class DemoA {
	
	public static int DataA;// static global variable
	public final int DataB;// immutable global variable(not static)
	public final static int DataC=300;//constant
	private int dataD;
	//constructor
	/*
	 * constructor is a special method
	 * the name of the constructor and the name of the class will be same
	 * Constructor don't have return type
	 * Constructors can take parameters
	 */
	public DemoA(int dataB)
	{
		/* Assigning value to the global read only field (this.DataB)*/
		this.DataB=dataB;
	}
	/**
	 * static method can be called without an object
	 */
public static void sayHello() {
	System.out.println("Hello Developer!!!");
}
public void greetUser()
{
	System.out.println("Greetings User !!!");
}
}
