package Coding_String;

public class ReverseString {

	// How to reverse a String
	// Diff b/w String and StringBuffer
	// Do we have reverse method in String class
	
	public static void main(String[] args) {
		String s = "Ram is good";
		int len = s.length();
		String rev = "";
		for(int i=len-1;i>=0;i--) {
			rev = rev + s.charAt(i);
			System.out.print(s.charAt(i)+" ");  //1.
		}
		
		System.out.println();
		
		System.out.println(rev);  //2.
	
	// using StringBuffer class
	StringBuffer sf = new StringBuffer(s);
	System.out.println(sf.reverse());  //3.
	
	char ch[] = s.toCharArray();  //4.
	for (int i = ch.length-1; i >= 0; i--) {
		System.out.print(ch[i]+" ");
	}
	}
}
