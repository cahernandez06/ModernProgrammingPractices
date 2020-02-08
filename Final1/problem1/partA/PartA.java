package FinalTest.Final1.problem1.partA;

import java.util.function.BiPredicate;

//work with this lambda expression:   (Double x, Double y) -> x * y < x + y
public class PartA {
	// name and type of lambda goes here
	BiPredicate<Double, Double> biPredicatLamda= (x ,y) -> x * y < x + y;
		
	// static method for method reference.
	public static boolean test(Double x, Double y) {
		// TODO Auto-generated method stub
		return (x * y < x + y);
	}
	
	// representing lambda as a method refrence
	//TYPE: Class::staticMethod
	BiPredicate<Double, Double> biPredicateWithMethodRe = PartA::test;
	
	
	//representing lambda as a static nested class
	class MyClass implements BiPredicate<Double, Double> {
		@Override
		public boolean test(Double x, Double y) {
			// TODO Auto-generated method stub
			return (x * y < x + y);
		}

	}
	
	//evaluate with Double inputs 2.1, 0.35
	public void evaluator() {
		Double d1=2.1;
		Double d2=0.35;
		System.out.println("biPredicatLamda : "+ biPredicatLamda.test(d1,d2));
		System.out.println("biPredicateWithMethodRe : " +biPredicateWithMethodRe.test(d1,d2));
		System.out.println("nestedClass : "+ new MyClass().test(d1, d2));
		
	}
	public static void main(String[] args) {
		PartA p = new PartA();
		p.evaluator();
	}
	
	
}
