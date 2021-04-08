package predicates;

import java.util.function.BiPredicate;

public class BiPredicateEg {
	
	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> obj = (a,b) -> ((a+b) % 2 == 0);
		System.out.println("The value is :" +obj.test(5, 6));
		BiPredicate<Integer, Integer> obj1 = (a,b) -> ((a+b) % 2 == 0);
		System.out.println("The value is :" +obj1.test(5, 5));
		
		
	}
}
