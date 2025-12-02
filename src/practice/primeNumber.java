package practice;

public class primeNumber {
	public static void main(String[] args) {
		int isPrime=19;
		boolean isPrimeBool=true;
		for (int i = 2; i < isPrime/2; i++) {
			if(isPrime%i==0) {
				isPrimeBool=false;
				break;
			}
		}
		if(isPrimeBool)
		System.out.println("is prime no : "+ isPrime);
		else
		System.out.println("is not prime no : "+isPrime);
	}
}
