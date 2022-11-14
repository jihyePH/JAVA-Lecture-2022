package ch04;

import java.util.Scanner;

public class Ex11_For {

	public static void main(String[] args) {
		// 1-100까지 합
		int sum =0;
		for (int i=1; i<=100; i++)  	//정수형이여야함
			sum += i;
		System.out.println(sum);
		
		//1에서 10까지의 곱(factorial)
		int product=1;
		for (int i=1; i<=10; i++)
			product *= i;
		System.out.println(product);
		
		//사용자가 입력한 문자열을 5회 받아서 하나의 문자열로 만들기
		Scanner scan = new Scanner(System.in);
		String line = ""; 		//빈 문자열 만들기
		for (int i=0; i<5; i++) {  	//5회반복의미 
			System.out.println("입력하세요");
			String s = scan.nextLine(); // 한줄단위로 읽게됨 nextline
			line += s + " ";	//eclipse 자동정렬:ctrl+shift+f
		}
		System.out.println(line);
		scan.close();
		}
		
	}


