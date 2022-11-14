package ch04;

/**
 *  a + b + c =100, a<b<c 를 만족시키는 피타고라스수를 구하시오.
 */
public class Ex23_Pythagoras {

	public static void main(String[] args) {
		for (int a = 1; a<=332; a++) {
			for (int b=a+1; b <= 499; b++){    	//a<b<c 조건만족시키기위해
				int c = 1000 - a - b;
				if ( c*c == a*a + b*b) {
					System.out.println(a + "," +b +","+ c);
					break;
				}
			}
	   }
	}

}