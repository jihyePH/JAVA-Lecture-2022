package ch07;

public class Ex01_Main {

	public static void main(String[] args) {
		Ex01_Parent parent = new Ex01_Parent();
		Ex01_Child child = new Ex01_Child();
		
		parent.parentInt = 5;
		parent.parentMethod();
		
		child.childInt = 10;
		child.childMethod();
		
		
		child.parentInt = 20; 		//child가 parent의 field를 수정가능
		child.parentMethod();  		//parent의 method 사용가능

		Ex01_Child child2 = new Ex01_Child(200);
		child2.parentMethod();
	}

}
