package ch03;

/**
 * 연산자(Operator)
 */
public class Ex01_Operator {

	public static void main(String[] args) {
		int a = 3;
		int b = a++;		//증감연산자! post increment ++/-- :피연산자를 1씩 증가/감소
		System.out.printf("a = %d, \tb = %d\n", a, b); 		// \n,%n:newline의미
		int c = ++a;		// pre increment
		System.out.printf("a = %d, \tc = %d%n", a, c); 		// \t:tapkey,%d:정수 %f:실수
		
		String s = (a % 2 == 0) ? "짝수" : "홀수";	//3항연산자! 문자열을 사용위해 String 객체선언
		System.out.println(a + "은/는" + s);
		
		int sum = 0 ;
		sum += 1;
		sum += 2;
		System.out.println(sum);
		sum = 0;
		for (int i=1; i<=10; i++)
			sum += i; 					// num += 100,num = num + 100 줄임표현
		System.out.println(sum);
		
		short s1 =1;
		short ss = (short)-s1;		//단항 연산자 -를 하면 결과가 int type이됨
	}

}
