package ch04;

import java.util.Random;
import java.util.Scanner;

/* FizzBuzz문제
 *3의 배수 - Fizz
 *5의 배수 - Buzz
 *3과 5의 배수 - FizzBuzz
 *전부다 아니면 - 숫자
 */
public class Ex05_FizzBuzz {

	public static void main(String[] args) {
		//임의의 정수값을 생성: random모듈사용
		Random ran = new Random();  	//객체 생성 
		int number = ran.nextInt(100)+1; //1~100 까지 임의의 정수값 생성

		System.out.println("1에서 100까지의 정수를 입력하시오");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		number = num;
		scan.close();
	
		if (number % 15 == 0)
			System.out.println(number + ", FizzBuzz");
		else if (number % 3 == 0)
		System.out.println(number + ", Fizz");
		else if (number % 5 ==0)
		System.out.println(number + ", Buzz");
		else 
		System.out.println(number + ", " + number);
	
		
		
		
	}

}
