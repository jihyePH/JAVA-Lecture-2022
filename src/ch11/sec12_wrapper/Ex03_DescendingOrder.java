package ch11.sec12_wrapper;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03_DescendingOrder {

	public static void main(String[] args) {
		Integer[] intArr = {8, 19, 15, 23};
		
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		Arrays.sort(intArr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(intArr));
		
		//Integer Array 를 int array 로 변경하는 것은 Stream 
	}

}
