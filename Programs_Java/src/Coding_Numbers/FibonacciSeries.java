package Coding_Numbers;

//Write a program to display FIBONACCI series of a number?
//Def: a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers.
//The simplest is the series 1, 1, 2, 3, 5, 8, etc.

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter the number");
			int n = s.nextInt();
			int value = fabi(n);
			System.out.println(value + " is the fibonacci number at place " + n + "");
		}
	}

	public static int fabi(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fabi(n - 1) + fabi(n - 2);
	}
}
