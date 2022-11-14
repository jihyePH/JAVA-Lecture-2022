package ch04;

/*
 * 입력값 : 정수입력
합이 100보다 작을때까지 입력을 받음

 */
import java.util.Scanner;

public class Ex13_While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while (sum< 100) {
			System.out.print("정수 입력>");
			int num = scan.nextInt();
			sum += num; 
			}
		System.out.println(sum);
		
		//의도적으로 무한루프를 만들고 탈출조건을 루프안에설정
		sum = 0;
		while(true) {  				//무한정 반복
			System.out.print("정수 입력>");
			int num = scan.nextInt();
			sum += num; 
			if(sum >=100)
				break;				//탈출
		}
		System.out.println(sum);
	}

}
