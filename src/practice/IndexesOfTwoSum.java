package practice;

import java.util.ArrayList;
import java.util.List;

//Given an array and a target, return indices of two numbers that add up to the target.
//
//Input: [2, 7, 11, 15], target = 22
//
//Output: [0, 1]
//
//Use: HashMap<Integer, Integer>
public class IndexesOfTwoSum {

	public static void main(String[] args) {
		int[] arr= {2,7,11,15};
		int target = 22;
		List<Integer> indexes=new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 1; j < arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					indexes.add(i);
					indexes.add(j);
					break;
				}
			}
		}
		indexes.forEach(System.out::println);
	}
}
