package Coding_Numbers;

// Write a program to check whether a user entered number is a PRIME NUMBER or Not?

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int n = s.nextInt();
			boolean rs = isPrime(n);
			if (rs == true) {
				System.out.println(n + " is a prime number");
			} else {
				System.out.println(n + " is not a prime number");
			}
		}

	}

	public static boolean isPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count == 2;
	}
}
