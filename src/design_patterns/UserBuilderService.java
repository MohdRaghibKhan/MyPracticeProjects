package design_patterns;

import design_patterns.User.UserBuilder;

class User{
	
	private final String firstName;
    private final String lastName;
    private final int age;
    private final String email;
    private final String phone;
    
    public User(UserBuilder userBuilder) {
    	
    	this.firstName=userBuilder.firstName;
    	this.lastName=userBuilder.lastName;
    	this.age=userBuilder.age;
    	this.email=userBuilder.email;
    	this.phone=userBuilder.phone;

    }
    public static class UserBuilder{
    	
    	private final String firstName;
        private final String lastName;
        private int age;
        private String email;
        private String phone;
        
        public UserBuilder(String firstName,String lastName) {
        	this.firstName=firstName;
        	this.lastName=lastName;
        }

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public UserBuilder email(String email) {
			this.email = email;
			return this;
		}
		
        public UserBuilder phone(String phone) {
        	this.phone=phone;
			return this;
        }
        
        public User build() {
        	return new User(this);
        }

		@Override
		public String toString() {
			return "UserBuilder [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email="
					+ email + ", phone=" + phone + "]";
		}
        
    }
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email=" + email
				+ ", phone=" + phone + "]";
	}
}

public class UserBuilderService {
	
	public static void main(String[] args) {
		
		 User build = new User.UserBuilder("Raghib", "Khan").age(25).email("raghibkhan889@gmail.com").phone("6393841563").build();
		System.out.println(build);
		User user = new User(new UserBuilder("raghib", "khan").age(25).email("raghibkahn@gmail.com").phone("12345678"));
		System.out.println(user);
	}
	
}
