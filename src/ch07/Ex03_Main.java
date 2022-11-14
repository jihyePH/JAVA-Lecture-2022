package ch07;

public class Ex03_Main {

	public static void main(String[] args) {
		Ex03_SupersonicAirplane ss = new Ex03_SupersonicAirplane();
		ss.takeOff();   		//이륙
		ss.fly(); 				//비행
		ss.flyMode = ss.SUPERSONIC; 	//초음속비행
		ss.fly(); 						//비행
		ss.flyMode = ss.NORMAL; 		//일반비행 
		ss.fly();
		ss.land();
	}

}
