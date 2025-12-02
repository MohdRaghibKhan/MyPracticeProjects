package practice;

public class Armstrong {
	public static void main(String[] args) {
		int oriNum=1634;
		int number=oriNum;
		int reminder=0;
		int res=0;
		while (number!=0) {
			reminder=number%10;
			res+=Math.pow(reminder, 4);
			number=number/10;
		}
		if(res==oriNum) {
			System.out.println("is armstrong");
		}else
			System.out.println("is not armstrong");
	}
}
