package design_patterns;


public class WorkerBuilder {
	public static void main(String[] args) {
		Worker build = new Worker.WorkerBuilder().setName("xyz").setEmail("xyz@gamil.com").setAge(21).build();
		System.out.println(build);
	}
}

class Worker{
	
	private final String name;
	private final String email;
	private final int age;
	private Worker(WorkerBuilder workerBuilder) {
		this.name=workerBuilder.name;
		this.email=workerBuilder.email;
		this.age=workerBuilder.age;
	}
	static class WorkerBuilder{
		private  String name;
		private  String email;
		private  int age;
		
		public WorkerBuilder setName(String name) {
			this.name=name;
		    return this;
		}
		public WorkerBuilder setEmail(String email) {
			this.email=email;
		    return this;
		}
		public WorkerBuilder setAge(int age) {
			this.age=age;
		    return this;
		}
		public Worker build() {
			return new Worker(this);
		}
	}
	@Override
	public String toString() {
		return "WorkerBuilder [name=" + name + ", email=" + email + ", age=" + age + "]";
	}
}