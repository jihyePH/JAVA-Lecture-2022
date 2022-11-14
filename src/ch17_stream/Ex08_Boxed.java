package ch17_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Wrapper
 */
public class Ex08_Boxed {

	public static void main(String[] args) {
		int[] intArray = {1,3,4,6,7};
		
		IntStream intStream = Arrays.stream(intArray);
		intStream.asDoubleStream()  		 //정수형->실수형
			.forEach(d -> System.out.println(d));
		System.out.println();
		
		intStream = Arrays.stream(intArray); //Stream은 일회용,다시만들어야함
		intStream.boxed()
				.forEach(obj-> System.out.println(obj.intValue()));
	}

}
