package ch14_lambda;

import ch11.sec11_arrays.Ex05_Member;

public class Ex04_SortMain {

	public static void main(String[] args) {
		Ex05_Member member1 = new Ex05_Member(0, "박자바");
		Ex05_Member member2 = new Ex05_Member(0, "이자바");
		Ex05_Member member3 = new Ex05_Member(0, "김자바");
		Ex05_Member[] members = {member1, member2, member3};
	}
	Arrays.sort(members, (o1,o2) -> o1.name.compareTo(o2.name));
	for (Ex04_Member member : members)
		System.out.println(member);
}
