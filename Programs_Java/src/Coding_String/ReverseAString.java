package Coding_String;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter a sentence..");
			String sc = s.nextLine();
			String[] str = sc.split(" ");
			String rev = "";
			for (int i = str.length-1; i >= 0; i--) {
				rev = rev + str[i]+" ";
			}
			System.out.println(rev);
		}
	}
} 
