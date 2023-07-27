package Coding_Numbers;

// Write a program to display sum of 1 to N numbers?

import java.util.Scanner;

public class SumOf_1_to_n_Numbers {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the value of n");
			int n = s.nextInt();
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum = sum + i;
			}
			System.out.println("Sum of numbers till "+n+" is: "+sum);
		}
	}
}
