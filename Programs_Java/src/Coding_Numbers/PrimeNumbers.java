package Coding_Numbers;

// Write a program to display PRIME NUMBERS from 1 to n?

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the value of n");
			int n = s.nextInt();
			System.out.print("Prime numbers between 1 and " + n + " is:");
			for (int i = 2; i <= n; i++) {
				boolean isPrime = true;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						isPrime = false;
					}
				}
				if (isPrime) {
					System.out.print(" " + i);
				}
			}
		}
	}
}
