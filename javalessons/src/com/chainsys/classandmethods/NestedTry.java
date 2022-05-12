package com.chainsys.classandmethods;
import java.util.Scanner;
public class NestedTry {
	static String[] data;
	public static void main(String[] args) {
		int num = 0;
		int numValue = 0;
		data = new String[2];
		java.util.Scanner sc=null;
		try {
			sc=new Scanner(System.in);
			try {
				System.out.println("Enter value for x");
				data[0]=sc.nextLine();
				numValue=Integer.parseInt(data[0]);//data[2];
				System.out.println("The square is"+numValue*numValue);
			}catch(NumberFormatException nb) {
				System.out.println("Not a Number!");
			}
			num=data.length;
			System.out.println("Array Length"+num);
		    }catch(ArrayIndexOutOfBoundsException ne) {
			System.out.println("ArrayIndexOutOfBounds - No arguments given!!!");
			}
			catch(Exception er) {
				System.out.println("Exception"+er.getMessage());
			}
	}

}
