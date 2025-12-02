package design_patterns;

public class BuilderPattern {

	private final String name;
	private final int age;
	private final String address;

	public BuilderPattern(Builder builder) {
		super();
		this.name = builder.name;
		this.age = builder.age;
		this.address = builder.address;

	}

	public static class Builder {
		private String name;
		private int age;
		private String address;

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setaddress(String address) {
			this.address = address;
			return this;
		}

		public BuilderPattern build() {
			return new BuilderPattern(this);
		}
	}

	@Override
	public String toString() {
		return "BuilderPattern [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}

class BuilderMain {
	public static void main(String[] args) {
		BuilderPattern builderPattern = new BuilderPattern.Builder().setName("raghib").setAge(25).setaddress("azamgarh")
				.build();
		System.out.println(builderPattern);
	}
}

class Student {

	private final String name;
	private final int rollNo;
	private final String course;

	public Student(StudentBuilder builder) {
		this.name=builder.name;
		this.rollNo=builder.rollNo;
		this.course=builder.course;
	}

	public static class StudentBuilder {
		private String name;
		private int rollNo;
		private String course;
		
		public StudentBuilder setName(String name) {
			this.name=name;
			return this;
		}
		public StudentBuilder setRollNo(int rollNo) {
			this.rollNo=rollNo;
			return this;
		}
		public StudentBuilder setCourse(String course) {
			this.course=course;
			return this;
		}
		public Student build() {
			return new Student(this);
		}
	}
}
