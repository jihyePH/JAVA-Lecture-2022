package ch14_lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex05_FunctionalMain {

	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Runnable");
		Consumer<Integer> c = i -> System.out.println(i*i);
		Supplier<Integer> s = () -> (int) (Math.random()*6)+1;
		Function<Integer, Integer> f = i -> i* i;
		Predicate<Integer> p= x -> x % 2 ==1;
		
		r.run();
		c.accept(5);						//Consumer
		System.out.println(s.get()); 		//Supplier
		System.out.println(f.apply(5));		//Function
		System.out.println(p.test(3));		//Predicate
		
		BiConsumer<Integer, Integer> bc = (x, y) ->System.out.println(x*x+y*y);
		bc.accept(3, 4);
		
		BiFunction<Integer, Integer, Double> bf = (x, y) -> Math.sqrt(x*x+y*y);
		System.out.println(bf.apply(3, 4));
		
		BiPredicate<Integer, Integer> bp = (x, y) -> x > y;
		System.out.println(bp.test(3, 4));
	}

}
