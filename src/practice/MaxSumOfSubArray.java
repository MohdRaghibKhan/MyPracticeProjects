package practice;

public class MaxSumOfSubArray { // kadane's algo

	public static void main(String[] args) {
		int[] arr = { 2, 3, -8, 7, -1, 2, 3 };
		int max = arr[0];
		int currentMax = arr[0];
		for (int i = 1; i < arr.length; i++) {

			currentMax = Math.max(arr[i], currentMax + arr[i]);
			max = Math.max(max, currentMax);
		}
		System.out.println(max);
	}
}
