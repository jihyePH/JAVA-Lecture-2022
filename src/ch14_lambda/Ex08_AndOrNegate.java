package ch14_lambda;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Ex08_AndOrNegate {

	public static void main(String[] args) {
		//2의 배수
		IntPredicate pA = a -> a % 2 == 0;
		//3의배수
		IntPredicate pB = a -> a%3 ==0;
		
		//and()
		IntPredicate pAB = pA.and(pB);  //2와3의 배수
		System.out.println(pAB.test(6));
		System.out.println(pAB.test(9));
		
		//or()
		pAB = pA.or(pAB); 	//2의 배수이거나 3의배수
		System.out.println(pAB.test(15));
		
		//negate() : not
		pAB = pA.negate();
		System.out.println(pAB.test(6));
	}

}
