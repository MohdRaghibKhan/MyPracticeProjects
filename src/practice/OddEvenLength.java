package practice;

import java.util.ArrayList;

public class OddEvenLength {
public static void main(String[] args) {
	int[] arr= {12,22,23,44,567,234,5899,124679,87036,1345};
	ArrayList<Integer> list = oddEvenLength(arr);
	
	System.out.println("even :"+list.get(0));
	System.out.println("odd :"+list.get(1));
}

public static ArrayList<Integer> oddEvenLength(int[] arr) {
	int even = 0;
	int odd = 0;
	ArrayList<Integer> evenOdds = new ArrayList();
	for (int i = 0; i < arr.length; i++) {
		String str = "" + arr[i];
		if (str.length() % 2 == 0) {
			even++;
		} else {
			odd++;
		}
	}
	evenOdds.add(even);
	evenOdds.add(odd);
	return evenOdds;

}
}
