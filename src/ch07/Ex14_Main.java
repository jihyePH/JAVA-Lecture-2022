package ch07;

/**
 * 강제 타입 변환(Casting)
 */
public class Ex14_Main {

	public static void main(String[] args) {
		Ex14_Parent parent = new Ex14_Parent();
		Son son = new Son();
		Daughter daughter = new Daughter();
		
		parent = son; 					//자동 타입변환
		parent.parentMethod();
		
		parent = daughter;
		parent.parentMethod(); 		//name, parentMethod
		
		/* 강제타입 변환 과정 - 옳지 않은방법 */
//		daughter = (Daughter) parent;  		//강제 타입변환(Casting)
//		daughter.daughterMethod();
//		
//		son = (Son)parent; 			//ClassCastException 오류발생
//		son.sonMethod();
		
		
		/* 강제타입 변환 과정 - 옳은 방법 */
		if (parent instanceof Daughter) {
			daughter = (Daughter) parent;  		 //true, instanceof = 이항연산자 역할
			daughter.daughterMethod();
		}
		if (parent instanceof Son) { 			//false
			son = (Son)parent; 			
			son.sonMethod();
		}
		
		
	}

}
