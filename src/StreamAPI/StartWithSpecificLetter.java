package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithSpecificLetter {
	public static void main(String[] args) {
		 List < String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
		   char ch='B';
		   long collect = colors.stream().filter(i -> i.startsWith(String.valueOf(ch))).count();
		   System.out.println(collect);
		   
	}

}
