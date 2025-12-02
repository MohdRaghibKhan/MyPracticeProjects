package cursor;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MouseMover {
    public static void main(String[] args) throws InterruptedException, AWTException {
        Robot rb = new Robot();
        Date startDate = new Date();
        System.out.println("Start time: " + startDate.toString());

        int i = 0; // Initialize a counter outside the loop
        while (true) { // Run indefinitely
            switch (i % 5) {
                case 0:
                    rb.mouseMove(50, 270);
                    break;
                case 1:
                    rb.mouseMove(900, 600);
                    break;
                case 2:    
                    rb.mouseMove(300, 500);
                    break;
                case 3:
                    rb.mouseMove(400, 600);
                    break;
                case 4:
                    rb.mouseMove(400, 500);
                    break;
            }
            Thread.sleep(50000); // Sleep for 50 seconds (or adjust as needed)
            i++; // Increment the counter
        }
    }
}
class Employee{
	int id;
	String name;
	String email;
	Double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String email, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
class Test{
	public static void main(String[] args) {
	
			List<Employee> employees=
					List.of(new Employee(1,"xyz","xyz@gmail.com",50000.00),
					new Employee(2,"abc","abc@gmail.com",70000.00),
					new Employee(3,"qwe","qwe@gmail.com",40000.00),
					new Employee(4,"asd","asd@gmail.com",20000.00),
					new Employee(5,"zxc","zxc@gmail.com",60000.00));
			
			Employee orElse = employees.stream().sorted((x,y) -> y.getSalary().compareTo(x.getSalary())).limit(3).reduce((x,y) -> y).orElse(null);
			System.out.println(orElse.getSalary());
			
		
	}
}