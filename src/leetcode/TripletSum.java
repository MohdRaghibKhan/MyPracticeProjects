package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {

	public static void main(String[] args) {
		int[] nums1 = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {0, 1, 1};
        int[] nums3 = {0, 0, 0};
        threeSum(nums1);
	}

	private static void threeSum(int[] nums) {
//		nums = [-4, -1, -1, 0, 1, 2]
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

			int j = nums[i];
			int target=-nums[i];
			int left=i+1;
			int right=nums.length-1;
			while(left < right) {
				int sum = nums[left] + nums[right];
				if(target==sum) {
					result.add(Arrays.asList(nums[i],nums[left],nums[right]));
					
					while(left< right && nums[left] == nums[left+1]) {
						left++;
					}
					while(left< right && nums[right] == nums[right-1]) {
						right--;
					}
					left++;
				}else if(target > sum) {
					left++;
				}else {
					right--;
				}
			}
		}
		System.out.println(result);
	}
	
}
