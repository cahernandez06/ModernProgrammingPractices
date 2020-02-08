package Day4.Prob5;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> empAccounts = new ArrayList<Account>();
	
	Employee(String name){
		this.name=name;
	}
	public void addAccount(Account a) {
		empAccounts.add(a);
	}
	public double computeUpdatedBalanceSum() {
		//Done
		double sumBals=0;
		
		for (Account a:empAccounts)
			sumBals += a.computeUpdatedBalance();
		return sumBals;
	}
}
