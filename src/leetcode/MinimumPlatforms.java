package leetcode;

import java.util.Arrays;

public class MinimumPlatforms {

	public static void main(String[] args) {
		  int[] arrival = {900, 940, 950, 1100, 1500, 1800};
	       int[] departure = {910, 1200, 1120, 1130, 1900, 2000};
	       System.out.println(findMinimumPlatforms(arrival, departure));
	}

	private static int findMinimumPlatforms(int[] arrival, int[] departure) {

		Arrays.sort(arrival);
		Arrays.sort(departure);
		int i = 0;
		int j = 0;
		int platform = 0;
		int maxplatform = 0;
		int lastArival = arrival.length;

		while (i < lastArival && j < lastArival) {

			if (arrival[i] <= departure[j]) {
				platform++;
				i++;
			} else {
				platform--;
				j++;
			}
			maxplatform = Math.max(maxplatform, platform);
		}
		return maxplatform;
	}
	
}
