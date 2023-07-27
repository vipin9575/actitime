package Coding_Numbers;

import java.util.Scanner;

// Write program to check the given number is STRONG or not?
// Strong numbers are the numbers whose sum of factorial of digits is equal to the original number. Example: 145 is a strong number.
public class StrongNumber {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter the number");
			int n = s.nextInt();
			int temp = n;

			int sum = 0;
			while (n != 0) {

				int x = n % 10;

				sum = sum + fact(x);
				n = n / 10;
			}

			System.out.println(temp + " " + sum);
			if (sum == temp) {
				System.out.println(temp + " is a strong number");
			} else {
				System.out.println(temp + " is not a strong number");
			}
		}
	}

	public static int fact(int x) {
		int fact = 1;
		while (x != 0) {
			fact = fact * x;
			x--;
		}
		return fact;
	}
}
