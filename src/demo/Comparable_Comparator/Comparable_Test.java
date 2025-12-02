package demo.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_Test implements Comparable<Comparable_Test> {
	String name;
	int age;
	String branch;

	public Comparable_Test(String name, int age, String branch) {
		this.name = name;
		this.age = age;
		this.branch = branch;
	}

	@Override
	public int compareTo(Comparable_Test that) {
		if (this.age == that.age) {
			return 0;
		} else if (this.age > that.age) {
			return 1;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		List<Comparable_Test> empObj = new ArrayList<>();
		empObj.add(new Comparable_Test("Raghib khan", 24, "CSE"));
		empObj.add(new Comparable_Test("Vipin singh", 70, "BSE"));
		empObj.add(new Comparable_Test("Abhishek", 25, "ME"));
		empObj.add(new Comparable_Test("Salman", 24, "CE"));
		Collections.sort(empObj);
		System.out.println(">>>>>>>>>>>>>>>>>>>COMPARABLE");
		for (Comparable_Test comparable_Test : empObj) {
			System.out.println(comparable_Test.name + " " + comparable_Test.age + " " + comparable_Test.branch);
		}
	}

}
