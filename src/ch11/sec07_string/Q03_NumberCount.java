package ch11.sec07_string;

/*
 * 1~100 5가 몇번사용되는가?, 0~9 숫자가 각각몇번 사용되는가?
 */
public class Q03_NumberCount {

	public static void main(String[] args) {
		String numbers = "";
		for (int i=1; i<=100; i++)
			numbers += i;
		
		for (int i=0; i<=9; i++) {
		System.out.println(i + ":" + Strings.count(numbers, String.valueOf(i)));
		
	}

}
}