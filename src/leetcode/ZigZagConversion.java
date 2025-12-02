package leetcode;

import java.util.Iterator;

public class ZigZagConversion {
	public static void main(String[] args) {
		
		String s="PAYPALISHIRING";
		int numRows=4;
	
		StringBuilder[] rows =new StringBuilder[numRows];
		for (int i = 0; i < rows.length; i++) {
			rows[i] = new StringBuilder();
			
		}
		boolean goingDown=false;
		int rowIdx=0;
		for (int i = 0; i < s.length(); i++) {
			char chr = s.charAt(i);
			rows[rowIdx].append(chr);
//			agr rowidx 0 hai then false +!goingDown= true means increment rowidx if reach to bottom then decrease by each iteration
			if(rowIdx==0 || rowIdx==numRows-1) {
				goingDown=!goingDown;
			}
			rowIdx+= goingDown ? 1 : -1;
		}
		StringBuilder  result=new StringBuilder();
		for (int i = 0; i < rows.length; i++) {
			result.append(rows[i]);
		}
		System.out.println(result);
	}
}