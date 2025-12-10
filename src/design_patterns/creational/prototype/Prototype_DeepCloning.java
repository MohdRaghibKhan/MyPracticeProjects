package design_patterns.creational.prototype;

public class Prototype_DeepCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Department department=new Department("CSE");
		Manager manager=new Manager(1, department);
		Manager clone = manager.clone();
		Department dup=new Department("EC");
	    manager.department.depName = "EC"; // change original AFTER cloning
	    System.out.println(manager);  // Should print EC
	    System.out.println(clone);    // Should still print CSE (deep cloning)
	}
}


class Manager implements Cloneable{
	int id;
	Department department;
	
	public Manager(int id,Department department) {
		this.id=id;
		this.department=department;
	}
	
	@Override
	protected Manager clone() throws CloneNotSupportedException {
		Manager Manager = (Manager) super.clone();
		Manager.department=department.clone();
		return Manager;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", department=" + department + "]";
	}
}
class Department implements Cloneable{
	String depName;
	public Department(String depName) {
		this.depName=depName;
	}
	@Override
	protected Department clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Department) super.clone();
	}
	@Override
	public String toString() {
		return "Department [depName=" + depName + "]";
	}
	
}
