package Coding_Numbers;

import java.util.Scanner;

// Write a program to count PRIME NUMBERS from 1 to n?

public class CountPrimeNumbers {
	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			int count = 0;
			for (int i = 2; i <= n; i++) {
				boolean isPrime = true;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						isPrime = false;
					}
				}
				if (isPrime == true)
					count++;
			}
			System.out.println("Prime numbers b/w 1 and "+n+": "+count);
		}
	}
}
