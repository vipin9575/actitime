package Coding_String;

public class StringManipulation {
	public static void main(String[] args) {
		String s = "Slow and steady wins the race"; // String is a collection of characters enclosed within double
													// quotes
		String s1 = "slow and steady wins the race";

		System.out.println(s.length()); // returns the length of the string

		System.out.println(s.charAt(5)); // returns the character present at that particular index in he given String

		System.out.println(s.indexOf("n")); // returns the index value of the 1st character present in the string if not
											// returns -1

		System.out.println(s.indexOf('s', 1)); // indexOf(char ch,int from index) is an overloaded method in the String
												// class,
												// it returns indexOf the given character only after searching from thee
												// given index

		System.out.println(s.lastIndexOf('a')); // returns index of the given character where it occurs last in the
												// given String

		System.out.println(s.lastIndexOf('a', 27)); // returns index of the given character,but the search starts from
													// the given index backwards

		System.out.println(s.equals(s1)); // overridden method in String class defined in Object class,compares the
											// invoking object value with the passed object value
 
		System.out.println(s.equalsIgnoreCase(s1)); // compares two string values w/o considering case differences
		
		String s2 = "   Hello World   ";
		String s3 = "12-12-1994";
		
		System.out.println(s2.trim()); // cutdown spaces at staring and ending of the string
		
		System.out.println(s2.replace(" ",""));
		
		System.out.println(s3.replace("-", "/"));
	}
}
