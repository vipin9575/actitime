package Coding_Numbers;

// Write a program to check given number is EVEN or ODD?

import java.util.Scanner;

public class Even_Odd {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter the number");
			int n = s.nextInt();
			if (n % 2 == 0) {
				System.out.println("Even Number");
			} else {
				System.out.println("Odd Number");
			}
		}
	}
}
