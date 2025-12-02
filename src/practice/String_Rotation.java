package practice;

public class String_Rotation {
public static void main(String[] args) {
	String str1="waterbottle";
	String str2="erbottlewat";
	boolean isRotation=true;
	if(str1.length()!=str2.length() || str1.length()==0) {
		isRotation=false;
	}
	String concatinated=str1+str1;
	if(concatinated.contains(str2) && isRotation) {
		System.out.println("String is rotation");
	}else {
		System.out.println("String is not rotation");
	}
}
}
