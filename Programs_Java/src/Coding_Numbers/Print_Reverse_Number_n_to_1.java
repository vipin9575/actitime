package Coding_Numbers;

// Write a program to Print REVERSE of N to 1 numbers?

import java.util.Scanner;

public class Print_Reverse_Number_n_to_1 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the value of n to print number");
			int n = s.nextInt();
			System.out.println("Printing the numbers from- "+n);
			for (int i = n; i >= 1; i--) {
				System.out.println(i);

			}
		}

	}
}
