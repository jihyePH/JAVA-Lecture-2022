package ch17_stream;

import java.util.Arrays;

public class Ex11_Looping {

	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		
		// 잘못한 경우 - peek는 중간처리 기능 (결과x)
		Arrays.stream(intArr)
			.filter(i-> i % 2 ==0)
			.peek(i -> System.out.println(i));
		
		Arrays.stream(intArr)
		.filter(i-> i % 2 ==0)
		.forEach(i -> System.out.println(i));
		System.out.println();
		
		//peek 사용하는 경우
		int total = Arrays.stream(intArr)
		.filter(i-> i % 2 == 0)
		.peek(i -> System.out.println(i))
		.sum();
		System.out.println("합계 : " + total);
	}

}
