package design_patterns;

public class Builder2 {
	public static void main(String[] args) {

		Employee build = new Employee.Builder("Raghib","Khan").age(25).address("gurugram").phone("6393841563").build();
		System.out.println(build);
	}
}
class Employee{
	
	private final String firstName;
	private final String lastName;
	private final int age;
	private final String phone;
	private final String address;
	
	public Employee(Builder builder) {
		this.firstName=builder.firstName;
		this.lastName=builder.lastName;
		this.age=builder.age;
		this.phone=builder.phone;
		this.address=builder.address;
	}
	public static class Builder{
		private  String firstName;
		private  String lastName;
		private  int age;
		private  String phone;
		private  String address;
		public Builder(String firstName,String lastName) {
			this.firstName=firstName;
			this.lastName=lastName;
		}
		public Builder age(int age) {
			this.age=age;
			return this;
		}
		public Builder phone(String phone) {
			this.phone=phone;
			return this;
		}
		public Builder address(String address) {
			this.address=address;
			return this;
		}
		public Employee build() {
			return new Employee(this);
		}
	}
}