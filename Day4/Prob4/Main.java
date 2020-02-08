package Day4.Prob4;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> myStaff = new ArrayList<Employee>();
		GregorianCalendar dateGC = new GregorianCalendar();
		Date dateOrd = dateGC.getTime();
		Commissioned c1 = new Commissioned(3,0.03,4000);
		Commissioned c2 = new Commissioned(4,0.03,5000);
		
		c1.addOrder(101,dateOrd,500.0);
		c2.addOrder(201,dateOrd,200);
		c2.addOrder(202,dateOrd,100);
		
		myStaff.add(new Hourly(1,8,20));
		myStaff.add(new Salaried(2,7000));
		
		myStaff.add(c1);
		myStaff.add(c2);
		//Y si fuera 1..*??
		
		for (Employee e:myStaff) {
	    	PayCheck p = e.calcCompensation(10, 2018);
			p.print();
		}

	}

}
