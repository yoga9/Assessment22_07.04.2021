package predicates;

import java.util.ArrayList;
import java.util.function.BiPredicate;

class Shoes{
	String shoesID;
	Integer shoeSize;
	Integer lacePrice;
	Integer socksPrice;
	
	public Shoes(String shoesID, int shoeSize, int lacePrice, int socksPrice) {
		super();
		this.shoesID = shoesID;
		this.shoeSize = shoeSize;
		this.lacePrice = lacePrice;
		this.socksPrice = socksPrice;
	}
}
public class BiPredicateProductEg {
	
	public static void main(String[] args) {
		ArrayList<Shoes> obj = new ArrayList<Shoes>();
		obj.add(new Shoes("A11", 8, 20, 20));
		obj.add(new Shoes("A14", 6, 60, 200));
		obj.add(new Shoes("A12", 4, 50, 300));
		obj.add(new Shoes("A16", 7, 30, 150));
		
		BiPredicate<Integer,Integer> P = (lacePrice,socksPrice) -> { 
			if((lacePrice+socksPrice) >50){
			return true;
		}
			else 
            return false;
  };
		for(Shoes s: obj)
		{
			if(P.test(s.lacePrice,s.socksPrice)) {
					System.out.println("The ShoesID - " +s.shoesID+ " is the Costly Product");
		 }
				else if(s.shoeSize > 5 ) {
					System.out.println("The ShoesID - " +s.shoesID+ " is the Cheap Product and too Best Product");	
			 }
				else {
					System.out.println("The ShoesID - " +s.shoesID+ " is the Cheap Product");
				}
			
	    }
	}
}
	
		
 

