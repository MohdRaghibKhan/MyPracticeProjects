package demo.serialization;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderSerialzer {

	public static void main(String[] args) {
		getSerialization();
		deserialization();
	}
//	 1 0 1 8 5 1 7 3 7 7 9 5 
//	 6 3 9 3 @ I p h o n e 
//	 101851737795 
//	 6393@Iphone 
	private static void deserialization() {
		try {

			String str=" 101851737795";
			FileWriter fileWriter=new FileWriter("/home/raghib/Documents/pf old password");
			fileWriter.append(str);
			fileWriter.close();
		} catch (Exception e) {
			System.out.println();
		}
	}

	private static void getSerialization() {
		try {
			FileReader fileReader=new FileReader("/home/raghib/Documents/pf old password");
			int chr=0;
			while((chr=fileReader.read())!=-1) {
				System.out.print(" ");

				System.out.print((char)chr);
			}

		} catch (Exception e) {
		}
	}
	
}
