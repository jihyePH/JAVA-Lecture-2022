package ch17_stream;

import java.util.ArrayList;
import java.util.List;

public class Ex13_Reduce {

	public static void main(String[] args) {
		List<Ex13_Student> list = new ArrayList<>();
		list.add(new Ex13_Student("안지혜", 80));
		list.add(new Ex13_Student("홍길동", 90));
		list.add(new Ex13_Student("김자바", 95));
		
		//방법 1
		int sum1 = list.stream()
						.mapToInt(Ex13_Student::getScore) 	//st->st.getScore
						.sum();
		System.out.println("방법1: " + sum1);
		
		//방법 2
		int sum2 = list.stream()
						.map(Ex13_Student::getScore)
						.reduce(0, (a,b)-> a+b);
		System.out.println("방법2: " + sum2);
		
	}

}
