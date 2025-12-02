package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

	public static void main(String[] args) {
		String romanString ="MCMXCIV";
		int romanToInt = romanToInt(romanString);
		System.out.println(romanToInt);
	}

	private static int romanToInt(String romanString) {
		Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int preValue=0;
        int result=0;
		for (int i = romanString.length()-1; i >= 0 ; i--) {
			int currentValue = romanMap.get(romanString.charAt(i));
			if(currentValue < preValue) { //MCMXCIV
				result=result-currentValue;
			}else {
				result=result+currentValue;
			}
			preValue=currentValue;
		}
		return result;
	}
	
}
