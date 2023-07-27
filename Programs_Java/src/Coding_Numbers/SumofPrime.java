package Coding_Numbers;

import java.util.Scanner;

// Write a program to find SUM OF PRIME numbers?

public class SumofPrime {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the range to print sum of prime Numbers");
			int n = s.nextInt();
			int sum = 0;
//			for (int i = 2; i <= n; i++) {
//				boolean isPrime = true;
//				for (int j = 2; j < i; j++) {
//					if (i % j == 0) {
//						isPrime = false;
//					}
//				}
//				if (isPrime) {
//					sum=sum+i;
//				}
//			}
//			System.out.println("sum of the prime numbers: "+sum);

			for (int i = 1; i <= n; i++) {
				boolean rs = isPrime(i);
				if (rs == true) {
					sum = sum + i;
				}
			}
			System.out.println(sum);
		}
	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
