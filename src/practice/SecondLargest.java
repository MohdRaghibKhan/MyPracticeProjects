package practice;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = { 10, 40, 20, 60, 30, 60, 70,70, 25, 80, 50 };
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i] > secondLargest && arr[i] != largest) {
				secondLargest=arr[i];
			}
		}
		if(secondLargest==Integer.MIN_VALUE) {
			System.out.println("there is no any second largest");
		}else {
			System.out.println("second largest is :- "+secondLargest );
		}
		int[] arr1 = {10, 5, 10};
		int larg=getSecondLargest(arr1);
		System.out.println(larg);
	}
	
	
	
	
	
	
	
	private static int getSecondLargest(int[] arr) {
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int val=arr[i];
			if(val> largest) {
				secondLargest=largest;
				largest=val;
			}else if(val > secondLargest && val!=largest) {
				secondLargest=val;
			}
		}
		return secondLargest;
	}
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
