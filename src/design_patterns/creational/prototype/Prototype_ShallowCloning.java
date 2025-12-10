package design_patterns.creational.prototype;

public class Prototype_ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee=new Employee(1,new Address("Raghib"));
		employee.id=1;
		System.out.println(employee);
		Employee clone = employee.clone();
		System.out.println(clone);
	}
	
}
class Address{
	String city;

	public Address(String city) {
		this.city=city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
}

class Employee implements Cloneable{

	int id;
	Address address;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, Address address) {
	
		this.id=id;
		this.address=address;
	}
	
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}
}