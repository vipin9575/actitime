package Coding_String;

import java.util.Scanner;

public class CountNoOfWordsInAString {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter any string or sentence..");
			String sc = s.nextLine();
			String word = "";
			int count = 0;
			for (int i = 0; i < sc.length(); i++) {
				if (sc.charAt(i)==' ') {
					word=word+"-"+count+" ";
					count=0;
				} else {
					count++;
					word=word+sc.charAt(i);
				}
			}
			word=word+"-"+count;
			System.out.println("number of characters in each words: "+word);
		}
	}
}
