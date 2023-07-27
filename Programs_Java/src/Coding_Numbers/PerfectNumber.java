package Coding_Numbers;

import java.util.Scanner;

// Write program weather the number is PERFECT NUMBER or not?
// Perfect number, a positive integer that is equal to the sum of its proper divisors. 
// The smallest perfect number is 6, which is the sum of 1, 2, and 3.

public class PerfectNumber {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter the number");
			int n = s.nextInt();
			int sum = 0;
			System.out.println("Proper divisor are:");
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					sum += i;
					System.out.println(i);
				}
			}
			if (sum == n) {
				System.out.println(n+" is a Perfect square");
			} else {
				System.out.println(n+" is not a Perfect square");
			}
		}
	}
}
