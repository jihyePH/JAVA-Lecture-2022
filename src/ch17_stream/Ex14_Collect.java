package ch17_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex14_Collect {

	public static void main(String[] args) {
		List<Ex14_Student> totalList = new ArrayList<>();
		totalList.add(new Ex14_Student("안지혜", "여",92));
		totalList.add(new Ex14_Student("홍기영", "남",87));
		totalList.add(new Ex14_Student("김민지", "여",97));
		totalList.add(new Ex14_Student("박자바", "남",93));
		
		//남자
		List<Ex14_Student> maleList = totalList.stream()
										.filter(st -> st.getGender().equals("남"))
										.collect(Collectors.toList());
		maleList.forEach(st -> System.out.println(st.getName()));
		
		maleList = totalList.stream()
				.filter(st -> st.getGender().equals("남"))
				.toList();
		maleList.forEach(st -> System.out.println(st.getName()));
		
		//학생 -> Map<이름,성적>
		Map<String,Integer> map = totalList.stream()
				.collect(
						Collectors.toMap(st->st.getName(), 
								st->st.getScore())
						);
		map.forEach((k,v)-> System.out.println(k + " : "+v));
							
	}

}
