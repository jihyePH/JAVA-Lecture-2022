package ch11.sec07_string;
/*
 * 문자열 바꿔치기
 */
public class Ex05_Replace {

	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어이고, 자바는 풍부한 API지원함";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr); 
	}

}
