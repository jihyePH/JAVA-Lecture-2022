package ch09;

public class Main {

	public static void main(String[] args) {
			A a = new A();
			
			
			//instance member class 객체
			A.B b = a.new B();
			b.field1 = 5;
			b.method1();
			
			//static member class 객체생성
			A.C c = new A.C();
			c.field1 = 7;
			c.field2 = 9;
			c.method1();
			c.method2();
			
			//local class 객체 생성을 위한 method 호출
			a.method();
	}

}
