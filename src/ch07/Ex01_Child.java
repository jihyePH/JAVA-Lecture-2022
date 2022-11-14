package ch07;

public class Ex01_Child extends Ex01_Parent{
	int childInt;
	
	Ex01__Child() {}
	Ex01_Child(int childInt) {
		super();
		this.childInt = childInt;
	}

	int childInt;
	
	void childMethod() {
		System.out.println(childInt);
	}

}
