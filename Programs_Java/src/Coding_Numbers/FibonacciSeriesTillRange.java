package Coding_Numbers;

import java.util.Scanner;

public class FibonacciSeriesTillRange {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter the range to get the fibonacci series");
			int n = s.nextInt();
			int a=0,b=1,c=0;
			for (int i =1; i <= n; i++) { 
				 c=a+b;
				if (c<=n) {
					System.out.print(c+" ");
					a=b;
					b=c;
				}
			}
		}
	}
}
