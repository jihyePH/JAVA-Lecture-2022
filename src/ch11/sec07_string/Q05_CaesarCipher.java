package ch11.sec07_string;

import java.util.Scanner;

public class Q05_CaesarCipher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문장 입력> ");
		String plainText = scan.nextLine();
		System.out.print("step> ");
		int step = scan.nextInt();
		System.out.println(plain2cipher(plainText, step));
	}
	
	static String plain2cipher(String text, int step) {
		char[] cipherText = new char[text.length()];
		for (int i=0; i<text.length(); i++) {
			char c = text.charAt(i);
			if (c== ' ') {
				cipherText[i]= c;
				continue;
			}
			char d = (char)(c + step);
			if (d > 'Z')
				d = (char)(d - 26);
			cipherText[i] = d;
		}
		return new String(cipherText);
				
	}
	
	static String cipher2plain(String text, int step) {
		return null;
	}
}
