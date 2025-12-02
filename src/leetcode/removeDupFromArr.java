package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeDupFromArr {

	public static void main(String[] args) {
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

}
