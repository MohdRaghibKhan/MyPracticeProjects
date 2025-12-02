package practice;

public interface I {
	public static String k="";
	default void salman() {
		salman3();
	}
	
	static void salman2() {
		salman3();
	}
	
	private static void salman3(){
		System.out.println("salman");
	}
	
}

class r implements I{
	@Override
	 public void salman() {
		System.out.println("salman");
	}
	static void salman2() {
		System.out.println("salman override");
	}
	
}

abstract class t{
	
	 void salman() {
		salman3();
	}
	
	static void salman2() {
		salman3();
	}
	
	private static void salman3(){
		System.out.println("salman");
	}
}

class m{
	public static void main(String[] args) {
		r r=new r();
		r.salman();
	}
}