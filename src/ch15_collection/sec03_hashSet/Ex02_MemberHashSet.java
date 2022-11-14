package ch15_collection.sec03_hashSet;

import java.util.HashSet;
import java.util.Set;

public class Ex02_MemberHashSet {

	public static void main(String[] args) {
		Member member1 = new Member("홍길동", 30);
		Member member2 = new Member("홍길동", 30);
		System.out.println(member1.hashCode()+", " + member2.hashCode());
		System.out.println(member1.equals(member2));
		
		Set<Member> set = new HashSet<>();
		set.add(member1);
		set.add(member2); 	//중복객체 (hashCOde와 equals
		set.add(new Member("홍길동", 31));
		set.add(new Member("홍길덩", 31));
		
		//저장된 객체수
		System.out.println("저장된 객체수: "+ set.size());
		
	}

}
