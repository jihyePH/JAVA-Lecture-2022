package ch04;

/*
 * Continue
 * 
 * 1에서 100까지 3의 배수를 제외한 합계
 */
public class Ex14_Continue {

	public static void main(String[] args) {
		int sum =0; 						//합계
		for (int i=1; i<=100; i++) { 		//반복문
			if(i % 3 == 0) 		//3의 배수인지 확인
				continue; 		//3의배수 제외
			sum += i;
		}
		System.out.println(sum);
		
		//100 이하의 양의 정수에서 3의배수의 합 
		sum = 0;							//초기화 0 시킴
		for (int i=3; i<=100; i+=3)  	//3의배수의값들
			sum += i;
		System.out.println(5050 - sum);
		
		sum = 0;
		for(int i=99; i>0; i-=3)
			sum += i;
		System.out.println(5050 - sum);
	}

}
