package ch04;

import java.util.Scanner;

/* 제곱의 합/합의 제곱 구하기
 * 10보다 큰 정수를 입력으로 받아 1부터 입력받은 숫자까지의
 * 제곱의 합과 합의제곱을 구하시오.
 * 1*1 + 2*2 + 3*3+ ....12*12 --> sumOfSquare
 * (1+2+..12) * (1+2+..12) --> squareOfsum
 */
public class Ex16_Square {

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
		
		int sum =0, sumOfSquare=0;
		for (int i=1; i<=num; i++) {
			sum += i; 				//합구하기
			sumOfSquare += i * i; 	//제곱의합 
		}
		int squareOfSum = sum + sum;
		System.out.println("제곱의 합 : " + sumOfSquare);
		System.out.println("합의 제곱 : " + squareOfSum );
			
		}
	}

