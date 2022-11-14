package ch07;

/*
 * 다형성 
 */
public class EX11_Polymorphism {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		
		parent = child1; 		//자동변환
		parent = child2;
		parent = new Child1();
	}

}
class Parent {
	
}
class Child1 extends Parent{
	
}
class Child2 extends Parent{
	
}