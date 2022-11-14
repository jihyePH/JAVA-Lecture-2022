package ch17_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex10_Sorted {

	public static void main(String[] args) {
		List<Ex10_Student> list = new ArrayList<>();
		list.add(new Ex10_Student("안지혜", 80));
		list.add(new Ex10_Student("홍길동", 90));
		list.add(new Ex10_Student("김자바", 95));
		
		//점수 오름차순 정렬
		list.stream()
			.sorted()
			.forEach(st -> System.out.println(st));
		System.out.println();
		
		// 점수 내림차순 정렬
		list.stream()
			.sorted(Comparator.reverseOrder()) 
			.forEach(st -> System.out.println(st));
			System.out.println();
			
		//이름 오름차순 정렬
		list.stream()
			.sorted((st1, st2)-> st1.getName().compareTo(st2.getName()))
			.forEach(st -> System.out.println(st));
		System.out.println();
		
		//이름 내림차순 정렬
		list.stream()
			.sorted((st1, st2)-> st2.getName().compareTo(st1.getName()))
			.forEach(st -> System.out.println(st));
	}

}
