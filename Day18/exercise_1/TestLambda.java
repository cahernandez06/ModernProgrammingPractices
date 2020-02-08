package Day18.exercise_1;

import java.util.Comparator;

import org.junit.Test;

import junit.framework.TestCase;

public class TestLambda extends TestCase {
	@Test
	public void testBalanceGt50() {
		Account a = new Account(100, new Customer("1", "John", "Doe"));
		Account a2 = new Account(10, new Customer("1", "John", "Doe"));
		System.out.println(Problem1.balanceGt50.test(a));
		assertEquals(true, Problem1.balanceGt50.test(a));
		assertFalse(Problem1.balanceGt50.test(a2));
	}
	
	@Test
	public void testGetCust() {
		Account a = new Account(100, new Customer("1", "John", "Doe"));
		assertEquals(new Customer("1", "John", "Doe"),  Problem1.getCustomer.apply(a));
	}
	
	@Test
	public void testGetLastName() {
		Customer c = new Customer("1", "John", "Doe");
		assertEquals("Doe", Problem1.lastName.apply(c));
	}
}
