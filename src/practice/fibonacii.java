package practice;

import java.util.ArrayList;

//       a series of numbers each number is addition of prevoius two
public class fibonacii {
	public static void main(String[] args) {
//		length of fibonacii
		ArrayList<Integer> list=new ArrayList<>();
		int len = 10;
		int first = 0;
		int second = 1;
		int tempThird = 0;
		list.add(0);
		list.add(1);
		for (int i = 0; i < len; i++) {
			tempThird = first + second;
			list.add(tempThird);
			first = second;
			second = tempThird;
		}
		list.stream().forEach(i -> System.out.println(i));
	}
}
