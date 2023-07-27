package Coding_String;

import java.util.Scanner;

public class Non_DuplicateCharactersInAString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string..");
		String sc = s.nextLine();
		char c[] = sc.toCharArray();
		int count;
		System.out.print("Non-duplicate characters in a given string: ");
		for (int i = 0; i < c.length; i++) {
			count = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] != c[j] && c[i] != ' ') {
					count++;
//					c[j]='0';
				}
			}
			if (count>1) {
				System.out.print(c[i]+" ");
			}else {
				
			}
		}
	}
}
