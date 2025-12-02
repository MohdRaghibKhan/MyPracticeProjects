package leetcode;

import java.util.Arrays;

public class MoveAll0s_AtTheEndOfArray {

	public static void main(String[] args) {
		
//	    int [] moveArr= {1,0,3,0,4,8,10,0};
	    
	    int [] moveArr= {3,4,0,5,0,1,0,8,10};

//	    {1,3,4,8,10,}
//	    shift0sAtEnd(moveArr);
//	    Arrays.toString(moveArr);
	    shift0sAtEndWithOrder(moveArr);
	    
	}

	private static void shift0sAtEndWithOrder(int[] moveArr) {
//		 here we are shifting all non zeros of left so that we can get all zeros element at the end
		int insertPosition=0;
		for (int i = 0; i < moveArr.length; i++) {
			int num=moveArr[i];
			if(num !=0) {
				moveArr[insertPosition++]=num;
			}
		}
//		now we know our index is stop at the correct sifted non zeroes to just fill remaining index with 0
		while(insertPosition< moveArr.length) {
			moveArr[insertPosition++]=0;
		}
		System.out.println(Arrays.toString(moveArr));
	}
	
	
	
// this sol is partially correct
private static void shift0sAtEnd(int[] arr) {
		
		int left = 0;
		int right= arr.length-1;
		while(left < right) {
			int num=arr[left];
			int lastNum=arr[right];
			if(num==0 && lastNum!=0) {
				int temp=arr[left];
			    arr[left]= arr[right];
				arr[right]=temp;
				right--;
			}
			left++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
