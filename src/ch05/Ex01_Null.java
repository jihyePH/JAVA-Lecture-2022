package ch05;

public class Ex01_Null {

	public static void main(String[] args) {
		String s = null;  		//null은 참조형변수에만 사용가능,null:아무것도없다는뜻
		int[] intArray = null; 	//정수형
	//	int a = null;   	안됨, 기본 타임에는 사용불가
		
//		System.out.println(s.length());   //String - s.length사용가능, NullPointerException
//		intArray[0] = 5; 				 //NullPointerException
		
		String s0 = "";  	//가리키는 곳이 빈칸이라는 뜻 " "
		System.out.println(s0.length());
	}

}
