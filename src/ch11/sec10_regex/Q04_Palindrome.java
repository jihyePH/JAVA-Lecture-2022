package ch11.sec10_regex;

import ch11.sec07_string.Strings;

public class Q04_Palindrome {

	public static void main(String[] args) {
		int max = 0, x = 0, y= 0;
		for (int i=100; i <=999; i++) {
			for (int k =i; k <=999; k++) {
				int mul = i * k;
				if (Strings.isPalindrome(String.valueOf(null)) && mul> max) {
					max = mul;
					x = i;
					y = k;
				}
			}
		}
		System.out.println(x + "x " + y + " = " + max);
	}

}
