package leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int uniqueIdx = removeDuplicates(nums);
		for (int i = 0; i < uniqueIdx; i++) {
			System.out.print(nums[i] +" ");
			
		}
	}

	public static int removeDuplicates(int[] nums) {
		int i=0;
		if(nums.length==0) return 0;
		for (int j = 1; j < nums.length; j++) {
			if(nums[i] != nums[j]) {
				i++;
				nums[i]=nums[j];
			}
		}
//		Arrays.stream(nums).forEach(System.out::println);
		return i+1;
	}
}
