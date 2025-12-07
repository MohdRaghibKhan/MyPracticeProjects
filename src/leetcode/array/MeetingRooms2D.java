package leetcode.array;

import java.util.Arrays;

public class MeetingRooms2D {
	public static void main(String[] args) {
		int[][] meetings = {
			    {900, 1030},
			    {1000, 1100},
			    {1200, 1400}
			};
//		 int[] start = {900, 1000, 1200};
//	     int[] end   = {1030, 1100, 1400};
		int[] start=new int[meetings.length];
		int[] end=new int[meetings.length];
		
		for(int i=0; i < meetings.length; i++) {
			start[i]=meetings[i][0];
			end[i]=meetings[i][1];
		}
		
		Arrays.sort(start);
		Arrays.sort(end);
		int i=0;
		int j=0;
		int rooms=0;
		int maxRooms=0;
		while(start.length>i) {
			if(start[i]<end[j]) {
				rooms++;
				i++;
			}else {
				rooms--;
				j++;
			}
			maxRooms = Math.max(maxRooms, rooms);
		}
		System.out.println(maxRooms);
	}
}
