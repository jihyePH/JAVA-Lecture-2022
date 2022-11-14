package ch02;

public class Ex01_Var {

	public static void main(String[] args) {
		int score = 90;		//변수 선언할때 초기값 부여
		int result = score *2;
		
		/*Literal */
		int intLiteral = 30;  //정수형,integer: byte,char,short,int,long
		int octal = 036; 	  //8진수(octal)   실수 : float, double
		int hexa = 0x1E;	 // 16진수(hexadecimal)  논리 : boolean(true,false)
		System.out.println(intLiteral);
		System.out.println(octal);
		System.out.println(hexa);
		System.out.printf("%d,%d,%d%n", intLiteral, octal, hexa);
		
		double doubleLiteral = 3.14159; 	//실수형,floating point
		char charLiteral = 'a';  	//문자형,single quote
		String strLiteral = "A quick brown fox";  //문자열
		boolean boolLiteral = true;  	// true, false
		System.out.println(intLiteral);
		
		if (result > 100 ) {
			int score1 = 30;
			System.out.println(score1);
		}
//		System.out.println(score1);  	//score1 변수는 if block 밖에서는 사용할수없음
	}

}
