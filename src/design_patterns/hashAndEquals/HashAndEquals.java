package design_patterns.hashAndEquals;

import java.util.HashSet;
import java.util.Set;

public class HashAndEquals {

	public static void main(String[] args) {

		Set<Employee> employees = new HashSet<>();
		employees.add(new Employee(101, "RAGHIB"));
		employees.add(new Employee(102, "Raghib"));
		System.out.println(employees);
		System.out.println(employees.size());
	}
}

class Employee {

	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this==obj) {
			return true;
		}
		if(obj==null || this.getClass()!=obj.getClass()) {
			return false;
		}
		Employee employee=(Employee) obj;
		return this.id==employee.id; // if already present id and current id is same then it will replace by current
	}
	
	@Override
	public int hashCode() {
		return Integer.hashCode(id); // this will generate same hashcode for similar ids
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
