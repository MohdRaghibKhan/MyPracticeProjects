package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class practice {
	public static void main(String[] args) {
		int[] nums = {3, 2, 1, 5, 6, 4};
	    int k = 3;
	    PriorityQueue<Integer> integers=new PriorityQueue<>();
	    for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			integers.offer(num);
			if(integers.size()>k) {
				integers.poll();
			}
		}
	    Integer peek = integers.peek();
	    System.out.println(peek);
//	    int[] arr= {2, 3, -8, 3, -1, 7, 3};
	    int[] arr= {-5,-4,-2,-1};

	    int maxSumOfSubArray = getMaxSumOfSubArray(arr);
	    System.out.println(maxSumOfSubArray);
	    
	    System.out.println("missing number in array");
	    int [] missingAray= {1,3,4,5};
	    int num=missingNumAray(missingAray);
	    System.out.println(num);
	    
		int[] dupArr = {3,2,1,2,1,2,4,5,6,7,8,3};
	    removeDupFromArr(dupArr);
 	}
	
	
	
	
	private static void removeDupFromArr(int[] dupArr) {
		List<Integer> integers=new ArrayList<>();
		int[] isVisited=new int[256];
		Arrays.fill(isVisited, -1);
		for (int i = 0; i < dupArr.length; i++) {
			int num = dupArr[i];
			isVisited[num]++;
		}
		for (int i = 0; i < isVisited.length; i++) {
			int num = isVisited[i];
			if(num==0) {
				integers.add(i);
			}
		}
		System.out.println(integers);
	}




	private static int missingNumAray(int[] missingAray) {
		
		int len=missingAray.length+1;
		int cal=len * (len+1);
		int possiblesum=cal/2;
		int arrSum=0;
		for (int i = 0; i < missingAray.length; i++) {
			arrSum+=missingAray[i];
		}
		int missingNumber=possiblesum-arrSum;
		return missingNumber;
	}




	public static int getMaxSumOfSubArray(int[] arr){
		int j=0;
		int maxSum=Integer.MIN_VALUE;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			sum=sum+num;
			if(sum > maxSum) {
				maxSum=sum;
			}
			if(sum<0) {
				sum=0;
			}
		}
	    System.out.println(maxSum);
		return maxSum;
	}
}

//
//package dummy;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Dummy {
//	
//	public static void main(String[] args) {
//        String input = "AB3C10";
////		Output: ABABABCCCC
//		String seq=getSequence_correct(input);
//		System.out.println(seq);
//		String seq1=getSequence(input);
//		
//	}
//
//	private static String getSequence_correct(String input) {
//		String temp="";
//		int count=0;
//		StringBuilder builder=new StringBuilder();
//		for (int i = 0; i < input.length(); i++) {
//			char chr = input.charAt(i);
//			if(Character.isDigit(chr)) {
//				count= count * 10 + (chr - '0');
//			}else {
//				
//				if(!temp.isEmpty() && count>0) {
//					builder.append(temp.repeat(count));
//					count=0;
//					temp="";
//				}
//				temp=temp+chr;
//			}
//		}
//		if(!temp.isEmpty() && count>0) {
//			builder.append(temp.repeat(count));
//			count=0;
//			temp="";
//		}
//		return builder.toString();
//	}
//
//	private static String getSequence(String input) {
//		int intIdx=1;
//		String temp="";
//		StringBuilder str=new StringBuilder();
//		for(int i=0;i < input.length() ;i++) {
//			if((input.charAt(i) >='0' && input.charAt(i)<= '9')) {
//				char intLen=input.charAt(i);
//				int count=Integer.parseInt(String.valueOf(intLen));
//				while (count>=1) {
//					str.append(temp);
//					count--;
//				}
//				temp="";
//			}else {
//				temp=temp+input.charAt(i);
//			}
//		}
//		System.out.println(str);
//		return temp;
//	}
//	
//}
