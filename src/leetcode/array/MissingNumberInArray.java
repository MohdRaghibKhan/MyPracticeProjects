package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,4,5,7,8,9};
		int missNum=missingNumber(arr);
		List<Integer> nums = multipleMissingNumber(arr);		
	}

	private static List<Integer> multipleMissingNumber(int[] arr) {
		List<Integer> integers=new ArrayList<>();
		int start=arr[0];
		boolean[] isVisited=new boolean[arr[arr.length-1]+1];
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			isVisited[num]=true;
		}
		for (int i = start; i < isVisited.length; i++) {
			boolean b = isVisited[i];
			if(!b) {
				integers.add(i);
			}
		}
		System.out.println(integers);
		return null;
	}

	private static int missingNumber(int[] arr) {
		int n=arr.length+1;
		int possibleSum=0;
		int start=arr[0];
		int end=arr[arr.length-1];
		for (int i = start; i <= end; i++) {
			possibleSum=possibleSum+i;			
		}
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		int missing=possibleSum-sum;
		System.out.println(missing);
		return missing;
	}
}
