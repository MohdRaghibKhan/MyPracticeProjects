package leetcode.searching;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 80;
        
        int left=0;
        int right =arr.length-1;
        boolean found=false;
        while(left <=right) {
        	int mid=left+(right-left) /2;
        	if(arr[mid]==target) {
        		found=true;
        		 break;
        	}
        	else if(arr[mid] > target) {
        		right=mid-1;        	
        	}else {
        		left=mid+1;
        	}
        }
      if(found) {
    	  System.out.println("found");
      }else {
    	  System.out.println("not found");
      }
		
	}
}
