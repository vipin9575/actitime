package Coding_Numbers;

import java.util.Scanner;

public class ReverseInteger {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int n = s.nextInt();
			
			//1.using algorithm
			int rev = 0;
			while (n != 0) {
				rev = rev * 10 + n % 10;
				n /= 10;
			}
			System.out.println(rev+" is the reverse number");
			
			//2.using StringBuilder
			
//			int num = s.nextInt();
			StringBuffer sf = new StringBuffer(String.valueOf(n));
			System.out.println(sf.reverse());
		}
	}
}
