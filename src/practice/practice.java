package practice;

public class practice {
	
	public static void main(String[] args) {
	 P p = null;
	 new P(42);
	 new P(43);
	 P p2=new P();
	 System.out.println(p2);
	}
}

class P {
	static int p;
	 P(int p) {
		this.p=p;
	}
	public P() {
		// TODO Auto-generated constructor stub
	}
	public static int getP() {
		return p;
	}

	public static void setP(int p) {
		P.p = p;
	}
	 @Override
	    public String toString() {
	        return "P [p=" + p + "]";
	    }
	
}