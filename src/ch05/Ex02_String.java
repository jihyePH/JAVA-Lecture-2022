package ch05;

public class Ex02_String {

	public static void main(String[] args) {
		String s1 = "홍길동"; 			//literal로 작성한 "홍길동"은 공통으로사용
		String s2 = "홍길동";
		System.out.println(s1 == s2);  		//true, 동일한 기억장소 가리킴
		
		String s3 = new String("홍길동"); 	//new :생성자,"홍길동"은 다른장소에 보관
		String s4 = new String("홍길동");
		System.out.println(s3 == s4);  		//false, 다른장소를 가리킴
		
		//값이 같은지를 물어볼 경우에는 equal() method 사용
		System.out.println(s1.equals(s3));  		//true
		System.out.println(s1.equals(s4));			//true
	}

}
