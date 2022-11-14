package ch15_collection.sec03_hashSet;

import java.util.HashSet;
import java.util.Set;

public class Ex01_HashSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		//객체 저장
		set.add("Java");
		set.add("JSP");
		set.add("JDBC");
		set.add("Servlet");
		set.add("Java"); 		//중복객체 저장안됨
		
		//저장된 객체수
		System.out.println("저장된 객체수 : " + set.size());
		System.out.println();
		
		//전체 출력
		for (String str : set)
			System.out.println(str);
		System.out.println();
		
		set.forEach(s -> System.out.println(s));
		
		//지우기
		set.remove("JSP");
		System.out.println("저장된 객체수 : " + set.size());
		System.out.println();
		
		set.removeIf(s -> s.length() > 6);
		set.forEach(s -> System.out.println(s));
	}

}
