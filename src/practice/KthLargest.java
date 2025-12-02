package practice;

import java.util.PriorityQueue;

public class KthLargest {
	
	public static void main(String[] args) {
		int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        Integer findKthLargest = findKthLargest(nums, k);
        System.out.println(findKthLargest); // Output: 5
	}

	private static Integer findKthLargest(int[] nums, int k) {
		
		PriorityQueue<Integer> minHeap=new PriorityQueue<>(k);
		for (Integer integer : nums) {
			
			minHeap.offer(integer);
			
			if(minHeap.size()>k) {
				minHeap.poll();
			}
			
		}
		return minHeap.peek();
	}
}
