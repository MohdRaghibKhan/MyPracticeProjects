package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
		   int[][] intervals = {
	                {900, 1030},
	                {1000, 1100},
	                {1200, 1400}
	        };
		   Arrays.sort(intervals,(a,b) -> Integer.compare(a[0], b[0]));
		   List<int[]> merged=new ArrayList<>();
		   int[] current = intervals[0];
		   merged.add(current);
		   for (int i = 0; i < intervals.length; i++) {
			int[] interval = intervals[i];
			if(interval[0] < current[1]) {
				current[1] = Math.max(interval[1], current[1]);
			}else {
				current=interval;
				merged.add(current);
			}
		}
		   
//	    print 
		   for (int[] interval : merged) {
	            System.out.println(Arrays.toString(interval));
	        }
	}
}
