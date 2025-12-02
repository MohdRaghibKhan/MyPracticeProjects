package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNo {
	public static void main(String[] args) {
		int num=29;
		
		boolean isPrime = IntStream.rangeClosed(2,(int) Math.sqrt(num)).allMatch(m -> num%m!=0);
		if(isPrime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
		System.out.println(">>>>>>>>>>>>Practice<<<<<<<<<<<<<<");
		List<String> listOfString = Arrays.asList("1", "2", "3", "4", "5");
		listOfString.stream().map(Integer::valueOf).collect(Collectors.toList());
	}
}

/*
 * first create all numbers from 2 to 29. we achieve this using range & we know
 * that any prime can be divisible by only with its half so use square root for check only upto its half range.
 * then we have to check each number is divisible with our num if any number is not divisible with our given number
 * then it is not otherwise it is a prime. for achive this we are using allmatch() which takes predicate and 
 * check for all value is satisfied to predicate or not if it is satisfied then return allMatch() true. otherwise 
 * false.
 */