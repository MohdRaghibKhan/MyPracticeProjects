package demo.Comparable_Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comperator_Test {
	String name;
	int age;
	String branch;

	public Comperator_Test(String name, int age, String branch) {
		this.name = name;
		this.age = age;
		this.branch = branch;
	}
}
//BY USING IMPLEMENTATION CLASS
class SortByAge implements Comparator<Comperator_Test> {
	@Override
	public int compare(Comperator_Test o1, Comperator_Test o2) {
		if (o1.age > o2.age) {
			return 1;
		} else if (o1.age == o2.age) {
			return 0;
		} else {
			return -1;
		}
	}
}
	// BY USING IMPLEMENTATION CLASS
class SortByBranch implements Comparator<Comperator_Test> {
	@Override
	public int compare(Comperator_Test o1, Comperator_Test o2) {
		return o1.branch.compareTo(o2.branch);
	}
}

class Main {
	public static void main(String[] args) {
		// by using anonymous inner class
		Comparator<Comperator_Test> sortByName = new Comparator<Comperator_Test>() {
			public int compare(Comperator_Test o1, Comperator_Test o2) {
				return o1.name.compareTo(o2.name); // will return 1,-1,0
			}
		};
		// by using lambda expression
//		Comparator<Demo> comparator=(o1,o2) -> {
//            return o1.name.compareTo(o2.name); // will return 1,-1,0
//	    };
		List<Comperator_Test> empObj = new ArrayList<>();
		empObj.add(new Comperator_Test("raghib", 30, "cse"));
		empObj.add(new Comperator_Test("salman", 27, "me"));
		empObj.add(new Comperator_Test("abhishek", 32, "bsc"));
		empObj.add(new Comperator_Test("vipin", 80, "msc"));
		System.out.println("SORT BY NAME >>>>>>>>>>>>>>>");
		Collections.sort(empObj, sortByName);
		for (Comperator_Test demo : empObj) {
			System.out.println(demo.name + " " + demo.age + " " + demo.branch);
		}
		System.out.println("SORT BY AGE >>>>>>>>>>>>>>>");
		Collections.sort(empObj, new SortByAge());
		for (Comperator_Test demo : empObj) {
			System.out.println(demo.name + " " + demo.age + " " + demo.branch);
		}
		System.out.println("SORT BY BRANCH >>>>>>>>>>>>>>");
		Collections.sort(empObj, new SortByBranch());
		for (Comperator_Test demo : empObj) {
			System.out.println(demo.name + " " + demo.age + " " + demo.branch);
		}
	}
}
