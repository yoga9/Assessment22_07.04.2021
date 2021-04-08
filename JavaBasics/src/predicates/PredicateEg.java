package predicates;

import java.util.function.Predicate;

interface demo{
	public static boolean test(int a) {
		
		if((a % 2) == 0) {
			System.out.println("The " +a +" is an even number");
			return true;
		}
		else {
			System.out.println("The " +a +" is an odd number");
		return false;
	}
		
}
	
}
public class PredicateEg{
	
	public static void main(String[] args) {
		
//		PredicateEg obj = new  PredicateEg();    //if incase default method
//		System.out.println(obj.test(61));
		System.out.println(demo.test(5));;           //if incase static method
				 
		Predicate<Integer> i = (no) -> (no % 2 == 0);
		System.out.println("The value is even number - " +i.test(50));
		System.out.println("The value is odd number - " +i.test(501));
//		boolean w = i.test(501);
//		System.out.println("The value is odd number - "+w);
	
		Predicate<String> s = (str) -> (str.length() < 5);
		System.out.println("The length of the string : "+s.test("YogiYogi"));
	
		String name[] = {"Monisha", "Zara", "Yalini", "Shalu"};
		Predicate<String> obj = name1 -> name1.length() >= 5 ;
		
		for(String name1 : name) {
			if(!obj.test(name1)) {
				System.out.println(obj.test(name1));
				System.out.println(name1);
			}
//			obj.test(name1);      //thz is no needed
//			System.out.println(obj);   
			
		}
	   
		int[] num = {6, 7, 8, 9, 10};
		Predicate<Integer> n1 = (num1) -> (num1 % 2 == 0);
		Predicate<Integer> n2 = (num1) -> (num1 >= 8);
		
		for(int num1 : num) {
			if(n1.test(num1) || n2.test(num1)) {         //here we can do.. (&&,||)
			System.out.println("The using 'Logical or' method "+num1);
		}
			else
				System.out.println("Condition not satisfied");
			
			if(n1.and(n2).test(num1)) {        //and,or,negate  -- methods of predicate.
				System.out.println("The using 'and' method " +num1);
			}
			
			if(n1.negate().test(num1)) {          //opposite printed
				System.out.println("The using 'negate' method " +num1);
			}
}

	
}
}

	


