package com.chainsys.introduction;

public class Third {
	public static void main(String[] args) {
		byte b1=-128;
		System.out.println("b1: "+b1);
		short shortMinValue=-32767;
		System.out.println("shortMinValue: "+shortMinValue);
		short shortMaxValue= 32767;
		System.out.println("shortMaxValue: "+shortMaxValue);
		int intMinValue=-217483647;
		System.out.println("intMinValue: "+intMinValue);
		int intMaxValue= 217483647;
		System.out.println("intMaxValue: "+intMaxValue);
		long longMinValue=-9223372036854775808L;
		System.out.println("longMinValue "+longMinValue);
		long longMaxValue= 9223372036854775807L;
		System.out.println("longMaxValue "+longMaxValue);
		float floatMinValue= -2147483648.5432F;
		System.out.println("floatMinValue "+floatMinValue);
		float floatMaxValue= -2147483648.11111F;
		System.out.println("floatMaxValue "+floatMaxValue);
		double doubleMinValue= -2147483648.5432D;
		System.out.println("doubleMinValue "+doubleMinValue);
		double doubleMaxValue= -2147483648.11111D;
		System.out.println("doubleMaxValue "+doubleMaxValue);
		char c1='A';
		System.out.println("c1 "+c1);
		char c2='a';
		System.out.println("c2 "+c2);
		int asciiofc1=(int) c1;
		System.out.println(asciiofc1);
		boolean flag= true;
		System.out.println(flag);
	}

}
