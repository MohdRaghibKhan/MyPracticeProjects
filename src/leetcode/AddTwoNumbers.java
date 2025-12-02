package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
//		 l1 = [2,4,3], l2 = [5,6,4]
		int[] l1= {2,4,3};
		int[] l2 = {5,6,4};
		
		int lenght=l1.length>l2.length ? l1.length : l2.length;
		int mult1=0;
		int mult2=0;
		int sum1=0;
		int sum2=0;
		int resSum=0;
		int[] res=new int[lenght];
		List<Integer> sumIntegers=new ArrayList<>();
		for (int i = lenght-1; i > 0; i--) {
			mult1=l1[i]*10;
			mult2=l2[i]*10;
			sum1=sum1+mult1;
			sum2=sum2+mult2;
		}
		resSum=sum1+sum2;
		while(resSum>0) {
			int modSum=resSum%10;
			sumIntegers.add(modSum);
			resSum=resSum/10;
		}
		System.out.println(sumIntegers);
		int[] arr=getOptimalSol(l1,l2);
		System.out.println(Arrays.toString(arr));

	}

	private static int[] getOptimalSol(int[] l1, int[] l2) {
		int carry=0;
		int lenght=Math.max(l1.length, l2.length);
		int[] sumArr=new int[lenght];
		for (int i = 0; i <lenght; i++) {
			 int l1Val = (i < l1.length) ? l1[i] : 0;
			    int l2Val = (i < l2.length) ? l2[i] : 0;

			    int sum = l1Val + l2Val + carry;

			    sumArr[i] = sum % 10;
			    carry = sum / 10;

		}

		if (carry != 0) {
		    sumArr[lenght] = carry;
		}
		return sumArr;
	}
	
	
}
