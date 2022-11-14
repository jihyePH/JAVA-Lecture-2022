package ch13_generic.sec01_non_generic;

public class Main {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동"); 			//자동타입변환
		String name = null;
		if (box.get() instanceof String)
		 name = (String) box.get(); 	//강제타입변환
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
	}

}
