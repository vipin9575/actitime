package Coding_Numbers;

// Write a program to find the FACTORIAL of a given RANGE of numbers?

import java.util.Scanner;

public class FactorialOfRangeNumber {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter a range to get their factorial");
			int n = s.nextInt();
			for (int i = 1; i <= n; i++) {
				fac(i);
				System.out.println(i+"! is: "+fac(i));
			}
		}
	}
	public static int fac(int x) {
		int fact = 1;
		while(x!=0) {
			fact=fact*x;
			x--;
		}
		return fact;
	}
}
