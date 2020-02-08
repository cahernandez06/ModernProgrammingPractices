package Day4.Prob5;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//Done
		double sumBals=0;
		
		for (Employee e:list)
			sumBals += e.computeUpdatedBalanceSum();
		return sumBals;
	}
}
