package leetcode;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] heights= {1,8,6,10,10,10,8,3,7};
		int mostWater = mostWater(heights);
		System.out.println(mostWater);
		
	}
	public static int mostWater(int[] heights) {
		
		int left =0;
		int right= heights.length-1;
		int maxArea=0;
		while (left < right) {
			
			int minHeight = Math.min(heights[left], heights[right]);
			int width=right-left;
			int area= minHeight* width;
			maxArea = Math.max(maxArea, area);
			if(heights[left] < heights[right]) {
				left++;	
			}else {
				right--;
			}
		}
		return maxArea;
	}
}
