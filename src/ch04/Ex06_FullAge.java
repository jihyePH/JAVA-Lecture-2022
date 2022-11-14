package ch04;

import java.time.LocalDate;
import java.util.Scanner;

/*
 * 만 나이 계산하기
 * 생년월일을 입력으로 받아, 오늘 현재 만 나이를 구하세요
 */

public class Ex06_FullAge {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  	//생일입력구간
		System.out.print("생년>");
		int bYear = scan.nextInt();
		System.out.print("생월>");
		int bMonth = scan.nextInt();
		System.out.print("생일>");
		int bDay = scan.nextInt();
		LocalDate birthDay = LocalDate.of(bYear, bMonth, bDay);
		System.out.println("생년월일 "+ birthDay);
		scan.close();
		
		LocalDate today = LocalDate.now();  	//현재날짜 설정구간
		System.out.println("오늘날짜 "+ today);
		int tYear = today.getYear();
		int tMonth = today.getMonthValue();
		int tDay = today.getDayOfMonth();
		
		//만나이 구하기:생일지남유무 
		int fullAge = 0;
		if (tMonth > bMonth)
			fullAge = tYear - bYear;
		else if (tMonth < bMonth)
			fullAge = tYear - bYear -1;
		else {		    	//tMonth=bMonth인 경우 day를 따져야함
			if (tDay >= bDay)
				fullAge = tYear - bYear;
			else
				fullAge = tYear - bYear -1 ;
			
		}
		System.out.println("만 나이는"+ fullAge + "세입니다.");
				
		
	}

}
