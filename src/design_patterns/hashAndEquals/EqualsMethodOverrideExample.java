package design_patterns.hashAndEquals;
class Helper{
	String name="raghib";
	@Override
	public boolean equals(Object obj) {
		Helper helper=(Helper) obj;
		return this.name.equals(helper.name);
	}
}

public class EqualsMethodOverrideExample{
	public static void main(String[] args) {
		Helper helper=new Helper();
		Helper helper2=new Helper();
		 if(helper.equals(helper2)) {
			 System.out.println("Equals");
		 }else {
			 System.out.println("Not equals");
		 }
		if(helper==helper2) {
			System.out.println("Equals");
		}else {
			System.out.println("Not equals");
		}
	}
}