package ch05;

/*
 * 향상된 For문(Enhanced - for)
 */
public class Ex16_EnhancedFor {

	public static void main(String[] args) {
		String[] fruits = {"Apple", "Banana", "Cherry"};
		for (int i = 0; i<fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		//2번째 방법(더많이씀)
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		int[] score = {82, 78, 90, 84, 76}; 		//평균구하기
		int sum=0;
		for (int element : score)
			sum += element;
		System.out.println((double) sum / score.length);  	//82.0
		
	}

}
