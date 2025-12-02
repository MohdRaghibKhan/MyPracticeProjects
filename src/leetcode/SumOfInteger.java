package leetcode;

import java.util.Arrays;

public class SumOfInteger {
	public static void main(String[] args) {
		int[] arr=bruteForce(13);
		int[] arr2=rightway(13);
		Arrays.stream(arr2).forEach(f -> System.out.println(f));
	}

	private static int[] rightway(int n) {
		for (int i = 1; i < n; i++) {
			
			int b=n-i;
			if(isNonZero(b) && isNonZero(i)) {
				return  new int[]{i,b};
			}
		}
		
		
		return new int[] {};
	}
	private static boolean isNonZero(int n) {
		
		while (n>0) {
			if(n%10==0) {
				return false;
			}
			n=n/10;
			
		}
		
		return true;
		
	}

	private static int[] bruteForce(int n) {
		int[] arr = new int[2];
		int integer = n / 2;
		int rem = n % 2;
		arr[0] = integer;
		arr[1] = integer + rem;
		Arrays.stream(arr).forEach(f -> System.out.println(f));
		return arr;
	}
	
	
}
