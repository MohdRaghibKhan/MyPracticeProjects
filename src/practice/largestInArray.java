package practice;

import java.util.Iterator;

public class largestInArray {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80,90,100};
		int largest=arr[0];
		for (int i : arr) {
			if(largest<i) {
				largest=i;
				}
		}
		System.out.println(largest);
	}
}
