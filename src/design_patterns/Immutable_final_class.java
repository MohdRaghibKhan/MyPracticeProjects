package design_patterns;
//   the class which generate only immutable objects is called as immutable class 
public final class Immutable_final_class {
	public Immutable_final_class(int id,String str) {
		this.id=id;
		this.str=str;
	}
	private  final int id;
	private final String str;
	public int getId() {
		return id;
	}
	public String getStr() {
		return str;
	}
	@Override
	public String toString() {
		return "Immutable_final_class [id=" + id + ", str=" + str + "]";
	}
}
class ImmutableFinal {
	public static void main(String[] args) {
		Immutable_final_class immutable_final_class = new Immutable_final_class(10, "First Object");
		System.out.println(immutable_final_class);
		System.out.println(immutable_final_class.getId()+" "+immutable_final_class.getStr());
		Immutable_final_class immutable_final_class2 = new Immutable_final_class(11, "Second Object");
		System.out.println(immutable_final_class2);
		System.out.println(immutable_final_class2.getId()+" "+immutable_final_class2.getStr());
		
	}
}
