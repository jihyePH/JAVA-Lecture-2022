package ch15_collection.sec06_treeSet;

import java.util.TreeSet;

public class Ex02_PersonComparable {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		//객체 저장
		treeSet.add(new Person("안지혜", 24));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("조영학", 22));
		treeSet.add(new Person("이영학", 22));
		
		for (Person p: treeSet)
			System.out.println(p.name+ ": "+ p.age);
			
		
	}

}
