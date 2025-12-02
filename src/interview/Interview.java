package interview; 

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interview {
	public static void main(String[] args) {
		String str = "Journey Json(object)"
				+ ">>coApplicant(array)Journey Json(object)"
				+ ">>coApplicant(array)Journey Json(object)"
				+ ">>coApplicant(array)";
		String str2="coApplicant(array)";
		int count=0;
		String[] splitStr = str.split(">>");
		for (int i = 0; i < splitStr.length; i++) {

			if(splitStr[i].contains("coApplicant(array)")) {
				count++;
			}
			
		}
		System.out.println(count);
	long collect = Arrays.stream(splitStr).filter( i -> i.contains("coApplicant(array)")).count();
		System.out.println(collect);
		//		Stream.of(str).filter(i -> str.split("coApplicant(array)")[i].equals("coApplicant(array)"))
	}
}
class Interview2{
	public static void main(String[] args) {
		 String input="123XX67";
		 String input2="1234567";
		 boolean bool=true;
		 for (int i = 0; i < input.length(); i++) {
			 if(input.length()!=input2.length()) {
				 bool=false;
				 break;
			 }
			 char ch = input.charAt(i);
			 char ch2 = input2.charAt(i);
			if(ch!=ch2 && ch!='X') {
				bool =false;
				break;
			}
//			if(input.length()-1==i && !bool) {
//				bool=true;
//			}
		}
		 System.out.println(bool);
	}
}

