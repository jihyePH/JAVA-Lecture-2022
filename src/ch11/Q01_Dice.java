package ch11;

import java.util.Random;

/*
 * 주사위3개 상금 계산하기
 * 같은눈3 : 10000+(주사위수)x1000
 * 같은눈2 : 1000+(주사위수)x100
 * 다른눈3 : (가장큰수)x100
 */

public class Q01_Dice {

	public static void main(String[] args) {	
		Random random = new Random();
		int num1 = random.nextInt(6) +1;
		int num2 = random.nextInt(6) +1;
		int num3 = random.nextInt(6) +1;
		int prize = getPrize(num1, num2, num3);
		System.out.println("주사위숫자 :" + num1 +", " + num2 + ", " + num3);
		System.out.printf("상금: %,d%n", prize);
	
	}
	private static int getPrize(int num1, int num2, int num3) {
		if (num1 ==num2 && num2 == num3) { 		//숫자3개 동일
			return 10000+num1*1000;
		}
		if (num1 == num2 || num2 == num3 || num1 == num3) {		//숫자2개 동일
			if (num2 == num3) {
				return 1000+num2*100;
			}
				return 1000 + num1 *100;  	//num1=num2, num1=num3 :num1로 통일
			}		
		
		int max = (num1>num2)?num1 : num2;
		max = (max > num3) ? max : num3;
		return max*100;

		
	}
}
