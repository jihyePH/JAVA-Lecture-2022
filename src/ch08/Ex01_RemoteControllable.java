package ch08;

/**
 * 인터페이스 interface 선언
 */
public interface Ex01_RemoteControllable {
	//상수 (Constant)
	public  int MAX_VOLUME = 10; 		//static final 생략
	public static final int MIN_VOLUME = 0;
	
	//추상 메소드!!!!
	public void turnOn(); 				//abstract 생략됨
	public abstract void turnOff();
	public abstract void setVolume(int volume);

	//default method - class 객체의 instance method
	public default void setMute(boolean mute) {
		if (mute)
			System.out.println("무음 처리합니다.");
		else
			System.out.println("무음 해제합니다.");
}
	//정적 메소드
	public static void changeBattery() {
		System.out.println("배터리를 교환합니다.");
	}
	
}
