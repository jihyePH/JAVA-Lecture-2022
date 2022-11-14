package ch05;

import java.util.Arrays;

/*
 * 도전과제
 * 
 * 두개의 양의정수를 커멘드아규먼트(comment Argument)로 입력받아서 
 * 공약수를 찾아서 배열에 넣어보기
 */
public class Ex18_Challenge {

	public static void main(String[] args) {
//step1. 두개의 양의 정수를 아규먼트로 입력받아 각각 num1, num2 변수에 넣기
		if (args.length != 2) {  	//2가 아닌경우
			System.out.println("사용법 : 두개의 양의 정수를 입력하시오.");
			System.exit(1);
		}
			int num1  = Integer.parseInt(args[0]);
			int num2  = Integer.parseInt(args[1]);
			System.out.println(num1 + ", " + num2);
			
//Step2.공약수 찾기:두숫자중에서 작은수만큼 for-loop을 돌면서 num1,num2로 나누어지는지 확인
			int min = (num1 <num2) ? num1 : num2; 		//3항연산자 사용하기, if문도 사용가능
//		for (int i=1; i<=min; i++) {
//			if ( num1 % i == 0 && num2 % i ==0) 		//공약수
//				System.out.println(i);
//		}
		
			
//Step3. 찾은 수를 배열로 만들기
//		1) 배열을 작은 수 만큼의 크기로 만든다.
//		2) step2에서 걸러진 공약수를 배열에 넣기
//		3) 공약수의 개수만큼 새로운 배열에 넣기
		int [] tmp = new int[min];
		int index = 0;
		for (int i=1; i<=min; i++) {
			if ( num1 % i == 0 && num2 % i ==0) 		
				tmp[index++] = i;		 		//공약수 배열에 넣기
		}
		System.out.println(index);
		System.out.println(Arrays.toString(tmp));
		
		int[] commonDivisors = Arrays.copyOf(tmp, index);
		System.out.println(Arrays.toString(commonDivisors));
	}

	}
