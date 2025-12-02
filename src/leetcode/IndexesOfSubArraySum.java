package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class IndexesOfSubArraySum {

	public static void main(String[] args) {

		int[] integers = { 1, 2, 3, 7, 5};

		int target = 12;

		List<Integer> indexesOfSubArrayWithOutStreams = getIndexesOfSubArray(integers, target);
		List<Integer> indexesOfSubArray = getIndexesOfMinimumSubArray(integers, target);
		System.out.println(indexesOfSubArray);
		System.out.println(indexesOfSubArrayWithOutStreams);
	}
	
	
	private static List<Integer> getIndexesOfSubArray(int[] integers, int target) {
		int sum=0;
		int startIdx=0;
		List<Integer> result=new ArrayList<>();
		for (int end = 0; end < integers.length; end++) {
			
			sum=sum+integers[end];
			
			while (sum > target && startIdx < end) {
				sum=sum-integers[startIdx];
				startIdx++;
			}
			
			if(sum==target) {
				 result.add(startIdx+1);
				 result.add(end+1);
				 return result;
			}
		}
		
		return result;
	}


	public static List<Integer> getIndexesOfMinimumSubArray(int[] integers,int target){

		List<Integer> subArray=new ArrayList<>();
		List<Integer> subArrayIndex=new ArrayList<>();
		List<List<Integer>> listOfSubArrayIndex=new ArrayList<>();

		for (int i = 0; i < integers.length; i++) {
			int j = integers[i];
			subArray.add(integers[i]);
			subArrayIndex.add(i);
//			System.out.println(integers[i]);
			Integer sumOfSubArray = sumOfSubArray(subArray);
			if(target==sumOfSubArray) {
				listOfSubArrayIndex.add(new ArrayList<>(subArrayIndex));
				subArrayIndex.clear();
				subArray.clear();
			}else if(target<sumOfSubArray) {
				while(!subArray.isEmpty() &&target!=sumOfSubArray) {
					subArray.remove(0);
					subArrayIndex.remove(0);
					 sumOfSubArray = sumOfSubArray(subArray);
				}
				if(sumOfSubArray!=0) {
					listOfSubArrayIndex.add(new ArrayList<>(subArrayIndex));
					subArray = new ArrayList<>(Collections.singletonList(subArray.get(subArray.size() - 1)));
					subArrayIndex = new ArrayList<>(Collections.singletonList(subArrayIndex.get(subArrayIndex.size() - 1)));
				}
			}
			
		}
		List<Integer> minSubArray = Collections.min(listOfSubArrayIndex,Comparator.comparing(List::size));
		
//		System.out.println(minSubArray);
		return minSubArray;
	}
	public static Integer sumOfSubArray(List<Integer> subArray) {
		Integer sumOfIntegers = subArray.stream().collect(Collectors.summingInt(Integer::intValue));
		return sumOfIntegers;
	}
}
