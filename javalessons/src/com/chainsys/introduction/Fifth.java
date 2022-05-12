package com.chainsys.introduction;

public class Fifth {
	public static void main(String[] args) {
		//printNumbersOneToTen();
		//printNumbersTenToOne();
		printTriangleB();
		//printMatrix();
	}

	public static void printNumbersOneToTen() {
		int count = 0;
		for (count = 1; count <= 10; count++) {
			System.out.println(count + " ");
		}
	}

	public static void printNumbersTenToOne() {
		int count = 0;
		for (count = 10; count >= 1; count--) {
			System.out.println(count + " ");
		}
	}

	public static void printMatrix() {
		int countA = 0;
		for (countA = 1; countA <= 10; countA++) {
			for (int countB = 1; countB <= countA; countB++) {
				System.out.print(countB + " ");
			}
			System.out.println();
		}
	}

	public static void printTriangleB() {
		int countA = 0;
		for (countA = 1; countA <= 10; countA++) {
			for (int countB = 1; countB < countA; countB++) {
				System.out.print(".");
			}
			for (int countC = countA; countC >= 1; countC--) {
				System.out.print(countC);
			}
			System.out.println();
		}

	}
}