package practice;

public class ThirdLargest {
	public static void main(String[] args) {
		int[] arr = { 90,10, 40, 20, 60, 30, 60, 70,70, 25, 80, 50 };
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				thirdLargest=secondLargest;
				secondLargest=largest;
				largest=arr[i];
			}
			else if(secondLargest < arr[i] && arr[i]!= largest) {
				thirdLargest=secondLargest;
				secondLargest=arr[i];
			}else if(thirdLargest < arr[i] && arr[i]!=largest) {
				thirdLargest=arr[i];
			}
		}
		if(thirdLargest==Integer.MIN_VALUE) {
			System.out.println("there is no any third largest");
		}else {
			System.out.println("third largest is :- "+thirdLargest);
		}
	}
}
