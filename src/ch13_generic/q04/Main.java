package ch13_generic.q04;

public class Main {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원");
	}

}
