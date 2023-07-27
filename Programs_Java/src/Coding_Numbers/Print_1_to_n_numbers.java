package Coding_Numbers;

// Write a program to Print 1 to N numbers?

import java.util.Scanner;

public class Print_1_to_n_numbers {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the value of n to print number");
			int n = s.nextInt();
			System.out.println("Printing the numbers till- "+n);
			for (int i = 1; i <= n; i++) {
				System.out.println(i);

			}
		}

	}
}
