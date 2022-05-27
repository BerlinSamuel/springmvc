package com.chainsys.introduction;

public class Diamond {
	public static void main(String[] args) {
		printDiamond();
	}
public static void printDiamond() {
	int n=5;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=n-1;j++) {
		System.out.println(".");
		}
		for(int k=i;k>=1;k--) {
		System.out.println(k);	
		}
		for(int l=2;l<=i;l++) {
			System.out.println(l);
		}
		System.out.println();
	}
	for(int i=4;i>=1;i--) {
		for(int j=1;j<=n-1;j++) {
			System.out.println(".");
			}
			for(int k=i;k>=1;k--) {
			System.out.println(k);	
			}
			for(int l=2;l<=i;l++) {
				System.out.println(l);
			}
			System.out.println();
		}
	}
}