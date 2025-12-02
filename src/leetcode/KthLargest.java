package leetcode;

import java.util.PriorityQueue;

public class KthLargest {
	
	public static void main(String[] args) {
		int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 3;
        Integer findKthLargest = findKthLargest(nums, k);
        System.out.println(findKthLargest); // Output: 5
	}

	private static Integer findKthLargest(int[] nums, int k) {
		
		PriorityQueue<Integer> integers=new PriorityQueue<>(k);
		
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
