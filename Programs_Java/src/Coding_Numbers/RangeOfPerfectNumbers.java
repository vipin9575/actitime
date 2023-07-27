package Coding_Numbers;

// Write a program to display RANGE of PERFECT NUMBERS?

import java.util.Scanner;

public class RangeOfPerfectNumbers {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter the number");
			int num = s.nextInt();
			for (int i = 1; i <= num; i++) {
				int sum = 1;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						sum += j;
					}
				}
				if (sum == i) {
					System.out.println(i+" is a perfect number");
				}
			}
		}
		
	}
}
