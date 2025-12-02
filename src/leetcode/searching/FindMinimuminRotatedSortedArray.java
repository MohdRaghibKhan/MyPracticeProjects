package leetcode.searching;

public class FindMinimuminRotatedSortedArray {
	public static void main(String[] args) {
		int[] arr2 = {3,4,5,1,2};

		int findMin = findMin(arr2);
		System.out.println(findMin);
	}
	public static int findMin(int[] arr) {
		int left=0;
		int right =arr.length-1;
		while(right>= left) {
		
//			find mid
			int mid=left + (right - left)/2;
			
			if(arr[mid] > arr[right]) {
				right=mid;
			}else {
				left=mid+1;
			}
		}
//		System.out.println(min);
        return arr[left];
	}
}
