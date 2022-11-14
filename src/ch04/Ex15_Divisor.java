package ch04;

import java.util.Scanner;

/**
 * 10보다 큰 정수를 입력으로 받아 약수(divisor)를 찾아주는 
 * 프로그램 작성하기
 */
public class Ex15_Divisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		while (true) {
			System.out.println("10보다 큰 정수를 입력하시오.");
			 num = scan.nextInt();
			if (num >10)
				break;
		}
		scan.close();
		
		for (int i=1; i<=num; i++) { 	//i 시작1에서 num까지 
		if (num % i ==0)
			System.out.println(i);
		}
		
	}

}
