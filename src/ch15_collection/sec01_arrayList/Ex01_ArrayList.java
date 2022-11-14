package ch15_collection.sec01_arrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("JSP/Servlet");
		
//		for (int i=0; i<list.size(); i++)
//			System.out.println(list.get(i));
		
		for (String str : list)
			System.out.println(str);
		System.out.println();
		
		list.add(2, "Database");
		list.add("iBATIS");
		for (String str : list)
			System.out.println(str);
		System.out.println();
		
		list.remove(2); 		//제거하기remove
		list.remove(2);
		for (String str : list)
			System.out.println(str);
		System.out.println();
		
		for (String str : list)
			System.out.println(str + ": " + str.length());
		System.out.println();
		
		list.removeIf(s -> s.length() > 5); 	//람다식 5글자초과 데이터삭제
		for (String str : list)
			System.out.println(str);
		System.out.println();
		
		list.set(0, "Java-11"); 		//변경하기 set
		list.set(1, "JDBC8.0");
		for (String str : list)
			System.out.println(str);
		System.out.println();
		
		System.out.println(list.isEmpty());
		System.out.println(list.contains("Java-11"));
		
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list.size());
	}

}
