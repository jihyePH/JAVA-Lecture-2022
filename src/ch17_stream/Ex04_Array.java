package ch17_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Array로부터 Stream 가져오기
 */

public class Ex04_Array {

	public static void main(String[] args) {
		String[] strArray = {"안지혜","김자바","박객체"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(s -> System.out.println(s));
		System.out.println();
		
		int[] intArray = {1, 2, 4, 5, 6 ,8};
		IntStream intStream = Arrays.stream(intArray);
		intStream.filter(i -> i >2 )
				 .peek(i -> System.out.println(i))
				 .map(i -> i *i)
				 .forEach(i-> System.out.println(i));
				 
		}
	}


