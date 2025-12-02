package design_patterns;
// singleton class is class which generate only one object that object is accessible to all used in connection pooling
//use case 
// Example: Financial transactions (e.g., Money, Currency, Transaction), coordinates (e.g., Point, Location).

public class Singleton_Pattern {
	private static final Singleton_Pattern instance = new Singleton_Pattern();

	private Singleton_Pattern() {

	}

	public static Singleton_Pattern getInstance() {
		return instance;
	}
}

class Singleton_Thread_Pattern {
	private static Singleton_Thread_Pattern instance;

	private Singleton_Thread_Pattern() {

	}

	public static synchronized Singleton_Thread_Pattern getInstance() {
		if (instance == null) {
			instance = new Singleton_Thread_Pattern();
		}
		return instance;
	}
}

class NormalClass {
	public static int d = 0;

	public static  NormalClass instance = new NormalClass();

	public NormalClass() {
	}

	public static NormalClass getInstance() {
		return instance;
	}

}

class SIngleTOnMain {
	public static void main(String[] args) {
	Singleton_Pattern instance1 = Singleton_Pattern.getInstance();
    Singleton_Pattern instance2 = Singleton_Pattern.getInstance();
    
    System.out.println("Singleton_Pattern instances:");
    System.out.println("Instance 1 hash code: " + instance1.hashCode());
    System.out.println("Instance 2 hash code: " + instance2.hashCode());
    System.out.println("Are they the same instance? " + (instance1 == instance2));

    Singleton_Thread_Pattern instance3 = Singleton_Thread_Pattern.getInstance();
    Singleton_Thread_Pattern instance4 = Singleton_Thread_Pattern.getInstance();
    
    
    System.out.println("\nSingleton_Thread_Pattern instances:");
    System.out.println("Instance 3 hash code: " + instance3.hashCode());
    System.out.println("Instance 4 hash code: " + instance4.hashCode());
    System.out.println("Are they the same instance? " + (instance3 == instance4));
    
    NormalClass instance5 = NormalClass.getInstance();
    NormalClass instance6 = NormalClass.getInstance();
    
    System.out.println("\nNormalClass instances:");
    System.out.println("Instance 5 hash code: " + instance5.hashCode());
    System.out.println("Instance 6 hash code: " + instance6.hashCode());
    System.out.println("Are they the same instance? " + (instance5 == instance6));
    
    // Demonstrating that NormalClass is not a proper singleton
    NormalClass instance7 = new NormalClass();
    System.out.println("\nNew NormalClass instance:");
    System.out.println("Instance 7 hash code: " + instance7.hashCode());
    System.out.println("Are instance 5 and instance 7 the same? " + (instance5 == instance7));}
}
