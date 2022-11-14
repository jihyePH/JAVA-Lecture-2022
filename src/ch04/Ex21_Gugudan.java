package ch04;

/**
 * 구구단 - 2단에서 4단까지
 */
public class Ex21_Gugudan {

	public static void main(String[] args) {
		for (int i=2; i<=5; i++) { 				//바깥에 for
			for (int k = 1; k<=9; k++) {  		//안쪽에 또 for문
				System.out.println(i + " * " + k +" = " + i*k);
			}
			System.out.println("==================");   //분위기반전으로 줄긋기
		}
	}

}
