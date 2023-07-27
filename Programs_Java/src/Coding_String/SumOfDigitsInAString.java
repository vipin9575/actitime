package Coding_String;

import java.util.Scanner;

// Write a program to find the sum of numbers in an ALPHA NUMERIC STRING?
public class SumOfDigitsInAString {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter the alpha-numeric string..");
			String sc = s.nextLine();
			char ch[] = sc.toCharArray();
			int sum = 0;
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] >= '0' && ch[i] <= '9') {
					sum = sum + ch[i]-48;
				}
			}
			System.out.println("Sum of the digits: " + sum);
		}
	}
}
