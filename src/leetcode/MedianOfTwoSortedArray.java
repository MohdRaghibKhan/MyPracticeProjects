package leetcode;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
		
		int[] arr1= {1,3};
		int[] arr2= {2,4};
		
		int[] arr3=new int[arr1.length+arr2.length];
//		{1,2,3,4}
		int i=0,j=0,k=0;
		while(arr1.length>i && arr2.length>j) {
			if(arr1[i]<arr2[j]) {
				arr3[k++]=arr1[i];
				i++;
			}else {
				arr3[k++]=arr2[j];
				j++;
			}
		}
		while(arr1.length>i) {
			arr3[k++]=arr1[i];
			i++;
		}
		while(arr2.length>j) {
			arr3[k++]=arr1[j];
			j++;
		}
		if(arr3.length%2==0) {
			int len=arr3.length/2;
			double sumOfMedian=arr3[len-1]+arr3[len];
			double median= sumOfMedian/2;
			System.out.println(median);
		}else {
			int len=arr3.length/2;
			double median=arr3[len];
			System.out.println(median);
		}
		
		
	}
}
