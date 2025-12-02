package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumClosest {

	public static void main(String[] args) {
		int[] nums1 = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {-1,2,1,-4};
        int[] nums3 = {0, 0, 0};
        threeSum(nums2);
	
		
	}
	private static int threeSum(int[] nums) {
//		nums = [-4, -1, -1, 0, 1, 2]
		Arrays.sort(nums);
		int target=1;
		int closestSum=nums[0]+nums[1]+nums[2];
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int left=i+1;
			int right=nums.length-1;
			while(left< right) {
				int sum=nums[i]+nums[left]+nums[right];
				if(sum==target) {
					closestSum=sum;
					return closestSum;
				}
				if(Math.abs(sum - target)<Math.abs(closestSum - target)) {
					closestSum=sum;
				}
				
				if(sum<target) {
					left++;
				}else {
					right--;
				}
			}
		}
		System.out.println(closestSum);
		return closestSum;
	}
}
