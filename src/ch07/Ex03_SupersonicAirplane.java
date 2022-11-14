package ch07;

public class Ex03_SupersonicAirplane extends Ex03_Airplane{
// NORMAL - 1, SUPERSONIC - 2 상수만들기 
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2; 	//airplane 만들때 상수값 설정가능
	
	int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC)
			System.out.println("초음속으로 비행합니다.");
		else
			super.fly();
	}
	
	
}
