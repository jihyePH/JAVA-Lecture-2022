package ch11;
/*
 * 완전수 
 * 약수의 합이 원래수가 되는것
 * 10000 미만 완전수 총4개 : 구하는 프로그램작성하기
 */
public class Q2_PerfectNumber {

	public static void main(String[] args) {
		for (int i=2; i<10000; i++) {
			if(isPerfectNumber(i))
				System.out.println(i);
		}
		
		for (int i=2; i<10000; i++) {
			int sumOfDivisors = 0;
			for (int k =1; i<i; k++) {
				if (i % k == 0)
					sumOfDivisors +=k;
			}
			if (i==sumOfDivisors)
				System.out.println(i);
		}
	}

	static boolean isPerfectNumber(int num) {
		int sumOfDivisors = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0)  		//i는 num의 약수 
				sumOfDivisors += i ;
		}
		return num == sumOfDivisors; 		//약수의 합이 원래수인경우
	}
}
