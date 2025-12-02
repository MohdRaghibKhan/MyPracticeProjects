package practice;

public class SubString_reversal {
	public static void main(String[] args) {
		String str="Hello world";
		StringBuilder builder=new StringBuilder();
		String[] splitStr = str.split("\\s");
		for (int i =splitStr.length-1; i>=0 ; i--) {
			builder.append(splitStr[i]);
			if(i>0) {
				builder.append(" ");
			}
		}
		System.out.println(builder);
	}
}
