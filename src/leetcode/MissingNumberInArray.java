package leetcode;

import java.util.Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 5 };
		int missinNumber = getMissingNumber(arr1);
		Arrays.stream(arr1).forEach(System.out::println);
		System.out.println("OUTPUT :"+missinNumber);
		
        int[] arr2 = {8, 2, 4, 5, 3, 7, 1};
		int missinNumber2 = getMissingNumber(arr2);
		Arrays.stream(arr2).forEach(System.out::println);
		System.out.println("OUTPUT :"+missinNumber2);
		
		int[] arr3 = {1};
		int missinNumber3 = getMissingNumber(arr3);
		Arrays.stream(arr3).forEach(System.out::println);
		 System.out.println("OUTPUT :"+missinNumber3);
	}

	private static int getMissingNumber(int[] arr1) {

//		formula for The sum of the first n natural numbers is:

//			n * (n+1)
//   	S= ------------		​
//			  2
		
//		missing => s - sum(arr)

		int n = arr1.length + 1; // since one number is missing
		int totalSum = n * (n + 1) / 2;
		int arrSum=0;
		for (int i : arr1) {
			arrSum+=i;
		}
		int mssingNumber=totalSum-arrSum;
		return mssingNumber;
	}
}
