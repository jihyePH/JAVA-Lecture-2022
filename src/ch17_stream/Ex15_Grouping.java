package ch17_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex15_Grouping {

	public static void main(String[] args) {
		List<Ex15_Student> totalList = new ArrayList<>();
		totalList.add(new Ex15_Student("안지혜", "여",92));
		totalList.add(new Ex15_Student("홍기영", "남",87));
		totalList.add(new Ex15_Student("김민지", "여",97));
		totalList.add(new Ex15_Student("박자바", "남",93));
		
		//남자맵, 여자맵
		Map<String, List<Ex15_Student>> map = totalList.stream()
				.collect(Collectors.groupingBy(st-> st.getGender()));
		List<Ex15_Student> maleList = map.get("남");
		maleList.forEach(st-> System.out.println(st.getName()));
		System.out.println();
		
		List<Ex15_Student> femaleList = map.get("여");
		femaleList.forEach(st-> System.out.println(st.getName()));
		
		//남여 평균
		Map<String, Double> scoreMap = totalList.stream()
				.collect(
						Collectors.groupingBy(st->st.getGender(),
								Collectors.averagingDouble(st->st.getScore()))
						);
		scoreMap.forEach((k,v)->System.out.println(k+" : "+ v));
				
	}

}
