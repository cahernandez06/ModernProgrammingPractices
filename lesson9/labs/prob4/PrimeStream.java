package lesson9.labs.prob4;

import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeStream {
	
//	public static Integer nextProbPrime(Integer s) {
//		BigInteger bi1;
//		String bi1str;
//		
//		bi1 = new BigInteger(Integer.toString(s));
//		bi1str=bi1.nextProbablePrime().toString();
//		return Integer.parseInt(bi1str);
//	}
	
	public static void printFirstNPrimes(long n) {
		final Stream<BigInteger> primes = Stream.iterate(BigInteger.ONE,x -> x.nextProbablePrime()).limit(n);
	
		System.out.println(primes.collect(Collectors.toList()));
	}
	 
	public static void main(String[] args) {

		
		PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
		ps.printFirstNPrimes(10);
		System.out.println("====");
		ps.printFirstNPrimes(5);
 	}
}
