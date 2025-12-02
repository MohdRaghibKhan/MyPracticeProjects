package leetcode;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
//		int[] nums= {0,1,2,2,3,0,4,2};
		int[] nums = { 1 };

		int removeElement = removeElement(nums, 1);
//		System.out.println();
		for (int i = 0; i < removeElement; i++) {
			int j = nums[i];
			System.out.println(nums[i] + " ");
		}
	}

//	Input: nums = [0,1,2,2,3,0,4,2], val = 2
//			Output: 5, nums = [0,1,4,0,3,_,_,_]
	public static int removeElement(int[] nums, int val) {
		if (nums.length == 0)
			return 0;
		int right = nums.length - 1;
		int left = 0;
		while (left <= right) {
			if (nums[left] == val) {
				while (left < right && nums[right] == val) {
					right--;
				}
				if (left <= right) {
					int num = nums[left];
					nums[left] = nums[right];
					nums[right] = num;
					right--;
				}
			}
			left++;
		}
//		Arrays.stream(nums).forEach(System.out::println);
		return right+1;
	}
}
