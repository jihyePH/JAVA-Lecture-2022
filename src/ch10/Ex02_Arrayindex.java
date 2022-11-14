package ch10;

/**
 * ArrayIndexOutofBounds Exception
 */

public class Ex02_Arrayindex {

	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[1]);
		
		if (args.length == 2) {
			System.out.println(args[0]);
			System.out.println(args[1]);
	} else {
		System.out.println("사용법 : 매개변수로 값2개를 적으세요");
	}

}
}
