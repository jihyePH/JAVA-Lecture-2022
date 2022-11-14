package ch15_collection.sec01_arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 반복문 찾아내기
 */
public class Ex04_Iteration {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		for (int i = 1; i<=5; i++)
			list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
		
		//전통적인 for 반복문
		for (int i = 0; i< list.size(); i++)
		System.out.println(list.get(i));
		System.out.println();
		
		//Enhanced - for loop
		for (Board b : list)
			System.out.println(b);
		System.out.println();
		
		//Iteration 객체사용
		Iterator<Board> iter = list.iterator();
		while (iter.hasNext()) {
			Board b = iter.next();
			System.out.println(b);
		}
		
		//forEach 
		list.forEach(b -> System.out.println(b));
		list.forEach(b -> System.out.println(b.getSubject()));
	}

}
