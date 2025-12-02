package cursor;

public class Var_Arg_Method {
	static int result=0;
	public static void sum(int ...a) {
		for(int x1 : a) {
		result+=x1;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		new Var_Arg_Method().sum();
		sum();
		sum(10,20);
		sum(10,20,30,40,50);
		
		
	}

}