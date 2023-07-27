package Coding_String;

import java.util.HashSet;
import java.util.Set;

;

public class DuplicateElements {
	public static void main(String[] args) {
		String s[] = { "java", "python", "javascript", "ruby", "java", "c" };

		// 1. Comparing each elements
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					System.out.println("Duplicate elements is:::" + s[i]);
				}
			}
		}

		// 2. Using HashSet
		Set<String> store = new HashSet<String>();
		for (String s1 : s) {
			if (store.add(s1) == false) {
				System.out.println("Duplicate elements is:::" + s1);
			}
		}
	}
}
