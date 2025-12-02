package leetcode.searching;

public class FindLastOccurrenceOfElement {
	public static void main(String[] args) {
		int target =7;
		int[] arr = { 2, 3, 4, 5, 6, 7, 7, 9, 10 };
		
		int res = -1;
		int left = 0;
		int right = arr.length;
		while (left <= right) {

			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				res=mid;
				left=mid+1;
			} else if (arr[mid] > target) {
				right = mid - 1;

			} else {
				left = mid + 1;
			}

		}
		System.out.println(res);
	}
}
