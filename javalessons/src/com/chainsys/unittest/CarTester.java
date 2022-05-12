package com.chainsys.unittest;

import com.chainsys.classandmethods.Car;

public class CarTester {
	public static void testCar() {
		Car firstCar=new Car("TN58 k 5951");
		firstCar.setColor("Red");
		firstCar.setFuel("Petrol");
		firstCar.setYearOfPurchase(2015);
		System.out.println(firstCar.getRegNo());
		System.out.println(firstCar.getColor());
		System.out.println(firstCar.getFuel());
		System.out.println(firstCar.getYearOfPurchase());
	}
}
