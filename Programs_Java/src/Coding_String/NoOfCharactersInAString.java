package Coding_String;

// Write a program to COUNT number of CHARACTERS in a String?

import java.util.Scanner;

public class NoOfCharactersInAString {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter the string...");
			String sc = s.nextLine();
			char ch[] = sc.toCharArray();
			int in[] = new int[ch.length];
			int count = 0;
			for (int i = 0; i < ch.length; i++) {
//			System.out.println(ch[i]); 
				in[i] = ch[i];
//			System.out.println(in[i]);
				if (in[i]>=65&&in[i]<=90 || in[i]>=97&&in[i]<=122 || ch[i]!=' '&&ch[i]!=','&&ch[i]!='.'||ch[i]>=0&&ch[i]<=9) {
					count++;
				}
			}
			System.out.println("Numbers of characters: "+count);
		}
	}
}
