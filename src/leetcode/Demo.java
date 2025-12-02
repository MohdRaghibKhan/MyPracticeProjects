package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		int[] arr= {5,3,8,1,9,2,12};
		int target=10;
		getTwoSumIdx(arr,target);		
	}

	private static void getTwoSumIdx(int[] arr, int target) {
		
		int left=0;
		int sum=0;
		int targetSum=0;
		for (int i = 0; i < arr.length; i++) {
			
			sum=sum+arr[i];
			if((sum > target)) {
				while (sum > target && i > left) {
					sum=sum-arr[left++];
				}
			}
			if(sum<=target) {
				targetSum=Math.max(targetSum,sum);
			}
		}
		
	}
}