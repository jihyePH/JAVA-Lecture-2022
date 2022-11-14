package ch06;

public class Ex01_Method {

	public static void main(String[] args) {
		int min = getMin(3, 4, 5);
		System.out.println(min);
		System.out.println(getMin(10, 20, 5));
	}
	
	static int getMin(int a, int b, int c) { 
		int min = (a < b) ? a : b;
		min = (min > c) ? a : min;

		return min;
				
	}
}
