package ch11;

import java.text.DecimalFormat;

public class Ex15_DecimalFormat {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		df = new DecimalFormat("00000000.0000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#"); 			//1234568
		System.out.println(df.format(num));
		df = new DecimalFormat("########.####"); 		//1234567.89
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0"); 		//1234567.9
		System.out.println(df.format(num));
		
	}

}
