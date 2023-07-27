package Coding_String;

import java.util.Scanner;

public class DuplicateCharactersInAString {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter a string..");
			String sc = s.nextLine();
			char ch[] = sc.toCharArray();
			int count;
			System.out.print("Duplicate characters in a given string: ");
			for (int i = 0; i < ch.length; i++) {
				count = 1;
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j] && ch[i]!=' ') {
						count++;
						ch[j]='0';
					}
				}
				if (count>1 && ch[i]!='0') {
					System.out.print(ch[i]+", ");
				}
			}
		}
	}
}
