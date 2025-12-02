package leetcode;

import java.util.Stack;

public class Next_Greater_Element_For_Each_Index {

	public static void main(String[] args) {
		
		int[] arr= {4, 5, 2, 10, 8};
		getNextGreaterArray(arr);
		System.out.println(getNextGreaterArray(arr));
		
	}

	private static Stack<Integer> getNextGreaterArray(int[] arr) {
		
		int n = arr.length;
		int[] result=new int[n];
		Stack<Integer> stack=new Stack<>();
		
		for (int i = arr.length-1; i >=0; i--) {
			
			if(!stack.isEmpty() && arr[i] >= stack.peek()) { 
				stack.pop();
			}
			result[i]=stack.isEmpty() ? -1 : stack.peek();
				
			stack.push(arr[i]);
		}
		return stack;
	}
}
