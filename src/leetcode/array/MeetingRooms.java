package leetcode.array;

import java.util.Arrays;

public class MeetingRooms {
	public static void main(String[] args) {
		 int[] start = {900, 1000, 1200};
	     int[] end   = {1030, 1100, 1400};
	     Arrays.sort(start);
	     Arrays.sort(end);
	     int i=0;
	     int j=0;
	     int rooms=0;
	     int maxRooms=0;
	     while(end.length>i) {
	    	 if(start[i] < end[j]) {
	    		 i++;
	    		 rooms++;
	    	 }else {
	    		 j++;
	    		 rooms--;
	    	 }
		     maxRooms= Math.max(maxRooms, rooms);
	     }
	     System.out.println(maxRooms);
	}
}
