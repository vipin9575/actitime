package Coding_Numbers;

import java.util.Scanner;

public class FactorialNumber {
public static void main(String[] args) {
	try (Scanner s = new Scanner(System.in)) {
		System.out.println("enter the number");
		int n = s.nextInt();
		int fac = 1;
		for (int i = n; i >= 1 ; i--) {
			fac = fac*i;
		}
		System.out.println("Factorial of "+n+" is: "+fac);
	}
}
}
