package practice;

import java.util.stream.Stream;

// lexographical order means sorting in dictionary order means sort array word wise
public class Lexographical {
	public static void main(String[] args) {
		String[] words= {"Ruby","C","Python","java"};
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1; j < words.length; j++) {
				if(words[i].compareTo(words[j])>0) {
					String temp=words[i];
					words[i]=words[j];
					words[j]=temp;
				}
			}
		}	
		Stream.of(words).forEach(i -> System.out.println(i));
	}
	
}
