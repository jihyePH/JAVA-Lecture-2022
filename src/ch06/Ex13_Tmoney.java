package ch06;


/* 
 *  Tmoney card
 *  - 10000원 카드 구매
 *  - 1회 요금 1350원씩 나감 
 *  - 티머니 카드안에 들어감 금액이 -가 되면 안됨. 
 *  - 잔액이 1000원이라고 하면 사용할 수 없음
 *  - 금액을 재충전 해야됨
 */ 
public class Ex13_Tmoney {

	public static void main(String[] args) {
		Tmoney card = new Tmoney(10000);
		while (true) { 
			if (!card.ride())
				break;
			System.out.println(card.cash);
		}
		card.charge(10000);
		while (true) { 
			if (!card.ride())
				break;
			System.out.println(card.cash);
	}

}
}
class Tmoney {
	int cash;
	
	Tmoney(){
		this.cash = 10000;
	}
	Tmoney(int cash){
		this.cash = cash;
	}
	boolean ride() {
		if (this.cash >= 1350) { 		//잔액1350원 있으면 성공
			this.cash  -= 1350;
			return true;
	}
		return false;
	}
	void charge(int cash) {
		this.cash += cash;
}
}
