package com.chainsys.introduction;
public class SwappingNumbers {

	public static void main(String[] args) {
	int x=67,y=92;
	System.out.println("x:"+x+"y:"+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("x:"+x+"y:"+y);
	}

}
