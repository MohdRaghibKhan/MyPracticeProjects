package leetcode;

import java.util.Arrays;

public class Sort012 {

	public static void main(String[] args) {
		int[] nums = {2, 0, 1, 0, 2, 1};
		sortcolors(nums);
		withoutSwaping(nums);
	}

	private static void withoutSwaping(int[] nums) {
		
		int count0=0;
		int count1=0;
		int count2=0;
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			switch(num) {
			case 0 :
				count0++;
				break;
			case 1 :
				count1++;
				break;
			case 2:
				count2++;
				break;
			}
		}
		int i=0;
		while(count0 > 0) {
			nums[i]=0;
			i++;
			count0--;
		}
		while(count1 > 0) {
			nums[i]=1;
			i++;
			count1--;
		}
		while(count2 > 0) {
			nums[i]=2;
			i++;
			count2--;
		}
		System.out.println(Arrays.toString(nums));
	}

	private static void sortcolors(int[] nums) {
		
		int current =0;
		int low=0;
		int high=nums.length-1;
		while (current< nums.length) {
			
			if(nums[current]==0) {
				swap(nums, low, current);
				low++;
				current++;
			}else if(nums[current]==1) {
				current++;
			}else {
				swap(nums, current, high);
				high--;
			}
		}
	}

	public static void swap(int[] nums, int i, int j) {
		int swap = 0;
		swap = nums[i];
		nums[i] = nums[j];
		nums[j] = swap;
	}
}
