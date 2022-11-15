package ch17_stream;

import java.util.Arrays;
import java.util.List;

public class Q07_Average {

	public static void main(String[] args) {
		List<Q06_Member> list = Arrays.asList(
				new Q06_Member("홍길동", 30)
				new Q06_Member("안지혜", 40)
				new Q06_Member("김자바", 20)
				);
		double avg = list.stream()
				.mapToInt(m->m.getAge())
				.average()
				.getAsDouble();
		
		System.out.println("평균나이:"+ avg);
	}

}
