package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
	
	public static void main(String[] args) {
		int[] nums = {1,5,10,13,16,9};
        int k = 3;
        Integer findKthLargest = findKthSmallest(nums, k);
        System.out.println(findKthLargest); // Output: 5
	}

	private static Integer findKthSmallest(int[] nums, int k) {
		
		PriorityQueue<Integer> integers=new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			integers.offer(num);
			if(integers.size()>k) {
				integers.poll();
			}
		}
		return integers.peek();
	}
}
