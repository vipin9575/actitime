package Coding_Numbers;

public class MissingNumbers {
	public static void main(String[] args) {
		
		int array[] = { 1, 2, 3, 4, 6 };
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		
		int sum1 = 0;
		int array1[] =  {1,2,3,4,5,6};
		for (int i = 0; i < array1.length; i++) {
			sum1 = sum1 + array1[i];
		}
		
		System.out.println("missing number is: "+(sum1-sum));
	}
}
