package leetcode;

import java.util.Arrays;

public class Shift0s {

	public static void main(String[] args) {
		
		int[] arr= {3,4,0,5,0,1,0,8,10};
//		shift0sAtEnd(arr);
		shift0sAtEndWithOrder(arr);
		
		
	}
	
	

	private static void shift0sAtEndWithOrder(int[] arr) {
		int insertPos=0;
		for (int i = 0; i < arr.length; i++) {
			int num=arr[i];
			if(num!=0) {
				arr[insertPos++]=num;
			}
		}
		while(insertPos< arr.length) {
			arr[insertPos++]=0;
		}
		System.out.println(Arrays.toString(arr));
		
	}



	private static void shift0sAtEnd(int[] arr) {
		
		int left = 0;
		int right= arr.length-1;
		while(left < right) {
			int num=arr[left];
			int lastNum=arr[right];
			if(num==0 && lastNum!=0) {
				int temp=arr[left];
			    arr[left]= arr[right];
				arr[right]=temp;
				right--;
			}
			left++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
