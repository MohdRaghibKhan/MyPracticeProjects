package leetcode;


public class MaxNumberofKSumPairs {

	public static void main(String[] args) {
//		int[] nums = {3,1,3,4,3};
		int[] nums = {1,2,3,4};
		int k = 5;
		int count=0;
		for (int i = 0; i < nums.length; i++) {
				
			for (int j = i+1; j < nums.length; j++) {
				int sum=nums[i]+nums[j];
				if(sum==k) {
					nums[i]=Integer.MIN_VALUE;
					nums[j]=Integer.MIN_VALUE;
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
