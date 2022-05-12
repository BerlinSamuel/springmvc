package com.chainsys.classandmethods;

import java.util.Scanner;

public class MultipleCatch {
	public static void m4() {
		System.out.println("Befor Try");
		int x=0,y=0,z=0;
		String s1=null,s2=null;
		java.util.Scanner sc=null;
		try
		{
			sc=new Scanner(System.in);
			System.out.println("Inside Try");
			System.out.println("Enter value for x");
			s1=sc.nextLine();
			System.out.println("Enter value of Y");
			s2=sc.nextLine();
			x=Integer.parseInt(s1);
			y=Integer.parseInt(s2);
				z=x/y;
			System.out.println("Result" +z);
		}
/*catch(Exception err)
		{
		System.out.println("Inside catch3" +err.getMessage());
		System.out.println("Error Type" + err.getClass().getName());
		}*/
catch(ArithmeticException err)	
		{
	System.out.println("Inside Catch1" +err.getMessage());
	System.out.println("ErrorType"+err.getClass().getName());
		}
		catch(NumberFormatException err)
		{
			System.out.println("Inside Catch2" +err.getMessage());
			System.out.println("ErrorType"+err.getClass().getName());		
			}
		catch(Exception err) {
			System.out.println("Inside Catch3" +err.getMessage());
			System.out.println("ErrorType"+err.getClass().getName());
		}
		finally {
			System.out.println("After Finally");
		}
		}
	}