package Coding_Numbers;

import java.util.Scanner;
 
public class PalindromeNumber {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter the number");
			int n = s.nextInt();
			int temp = n;
			int rev = 0;

			while (n != 0) {
				rev = rev * 10 + n % 10;
				n = n / 10;
			}
			if (rev == temp) {
				System.out.println(temp + " is a palindrome number");
			} else {
				System.out.println(temp + " is not a palindrome number");
			}
		}
	}
}
