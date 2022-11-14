package ch07;

/*
 * 매개변수의 다형성 
 * 해당 클래스의 객체 대입이 원칙이나 자식 객체 대입도 허용
 */
public class Ex13_Main {

	public static void main(String[] args) {
		Ex13_Driver driver = new Ex13_Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi); 		
	}

}
