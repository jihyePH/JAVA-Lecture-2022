package ch11.sec07_string;
/*
 * 문자열 앞뒤공백 잘라내기 trim
 */
public class Ex08_Trim {

	public static void main(String[] args) {
		String oldStr = "	자바 프로그래밍  \t  \r\n	";
		String newStr = oldStr.trim();
		
		System.out.println(newStr);
		System.out.println(newStr.length());
	}

}
