package Day18.exercise_1;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

public class Problem1 {
	
	public static Predicate<Account> balanceGt50 = a -> a.getBalance() > 50;
	public static Function<Account, Customer> getCustomer = (Account a) -> a.getCustomer();
	public static Function<Customer, String> lastName = (Customer c) -> c.getLastName();
		

	//A list of Customers whose checking account balance is > 50, sorted by customer's last name
	public static List<Customer> specialAccounts(List<Account> accounts) {
		return accounts.stream().filter(balanceGt50)
				 .map(getCustomer)
	             .sorted(Comparator.comparing(lastName))
	             .collect(Collectors.toList());
				             
	}
}
