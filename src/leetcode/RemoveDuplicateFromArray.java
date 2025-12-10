package leetcode;

import java.util.Arrays;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		
//		int[] arr= {1,1,3,2,1,4,2,5,2,5};
		int[] arr= {1,2,3,4,5};

		Arrays.sort(arr);
//		1,1,1,2,2,2,3,4,5,5
		
		
		
		int j=0;
		for (int i = 1; i < arr.length; i++) {
			int num1 = arr[i];
			int num2 = arr[j];
			if(num1!=num2) {
				j++;
				arr[j]=num1;
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, j+1)));
		
	}
}
