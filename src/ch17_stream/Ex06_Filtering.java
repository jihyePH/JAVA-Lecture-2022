package ch17_stream;

import java.util.ArrayList;
import java.util.List;

public class Ex06_Filtering {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("안지혜"); list.add("신용권"); list.add("권미영");
		list.add("신자바"); list.add("신용권");
		
		//중복 제거
		list.stream()
			.distinct()
			.forEach(s-> System.out.println(s));
		System.out.println();
		
		// '신'으로 시작하는 요소만 통과
		list.stream()
			.filter(s ->  s.startsWith("신"))
			.forEach(s-> System.out.println(s));
		System.out.println();
		
		//중복요소를 제거, 신으로 시작하는 요소만 통과
		list.stream()
		.distinct()
		.filter(s ->  s.startsWith("신"))
		.forEach(s-> System.out.println(s));

				
	}

}
