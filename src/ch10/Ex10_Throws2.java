package ch10;

/*
 * throw - main method에서 얌체같이 예외를 떠넘길수있음
 */
public class Ex10_Throws2 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}

}
