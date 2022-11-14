package ch04;

import java.util.Scanner;

/** 
 * Star 별모양으로 다이아몬드 그리기
 *
 */
public class Ex22_Star {

	public static void main(String[] args) {
		int num = 5;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("8보다 작은 정수를 입력하시오.");
			num = scan.nextInt();
			if (num < 8);
				break;
		}
		scan.close();
		
		//1사분면 그리기
		System.out.println("1사분면");
		for (int i=1; i <= num; i++) { 		// i : 1~5
			for (int k=1; k <= i; k++) { 	// k : i번 만큼 
				System.out.print("*"); 		//prinkln 줄바꿈일어나서 안됌
			}
			System.out.println();  		//밖에서 줄바꿈해주기 
		}
		
		//4사분면
		System.out.println("4사분면");
		for (int i = num; i >=1; i--) {
			for (int k=1; k <= i; k++) { 	// k : i번 만큼 
				System.out.print("*"); 		
			}
			System.out.println();
		}
		
		//2사분면
		System.out.println("2사분면");
		for (int i =1; i<= num; i++) {
			for (int k=1; k<=num - i; k++)  	//num-i번 만큼의 space
				System.out.print(" ");  		//spcae 만들기
			for (int k= 1; k<=i; k++)
				System.out.print("*");
			System.out.println();
		}
		
		//3사분면
		System.out.println("3사분면");
		for ( int i = num; i >= 1; i--) {
			for (int k=1; k<=num - i; k++)  	//num-i번 만큼
				System.out.print(" ");
			for (int k= 1; k<=i; k++)
				System.out.print("*");
			System.out.println();
		}
	}

}
