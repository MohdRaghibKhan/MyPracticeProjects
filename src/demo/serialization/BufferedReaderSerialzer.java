package demo.serialization;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderSerialzer {

	public static void main(String[] args) {
		serializer();
		deserialzer();
	}
    private static void deserialzer() {

    	
    	
	}
	//	101851737795 
//	 6393@Iphone 
	private static void serializer() {
		try {
			FileReader fileReader=new FileReader("/home/raghib/Documents/pf old password");
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			String line;
			while ((line=bufferedReader.readLine())!=null) {
				System.out.println(bufferedReader.readLine());
			}
			bufferedReader.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
