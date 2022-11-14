package ch04;

/**
 *  윤년, 평년
 */
public class Ex02_LeapYear {

	public static void main(String[] args) {
		int number = 1996;
		String evenOdd;
		if(number % 4 ==0) 
			evenOdd ="윤년";
			else if (number % 100 == 0)
				evenOdd = "평년";
			else if(number % 400 == 0)
				evenOdd = "윤년";
			System.out.println(number + "은/는" + evenOdd +"입니다."); 
	
			System.out.println("1996년은"+leapYear(1996)+"입니다.");
			int year = 1996;
			String result = leapYear(year);
	}

	private static String leapYear(int year) {
		if (year % 400 ==0)
			return "윤년";
			System.out.println(year +"윤년입니다.");
		else if (year % 4 == 0 && year % 100 !=0) 	//!반대
			System.out.println(year +"윤년입니다.");
		else
			System.out.println(year +"평년입니다.");
		
		return null;
	}

}
