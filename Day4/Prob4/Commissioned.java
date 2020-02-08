package Day4.Prob4;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Commissioned extends Employee{
	private double commission;
	private double baseSalary;
	private List<Order> commOrders = new LinkedList<Order>();
	
	public Commissioned(int empid, double commission, double baseSalary) {
		super(empid);
		this.commission=commission;
		this.baseSalary=baseSalary;
	}
	public void addOrder(int orderNo, Date orderDate, double orderAmount) {
		Order newOrd = new Order(this, orderNo, orderDate, orderAmount);
		commOrders.add(newOrd);
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	@Override
	public double calGrossPay(int month, int year) {
		// TODO Auto-generated method stub
		return getBaseSalary()+(getCommission()*sumTotalOrders(commOrders));
	}
	
	public double sumTotalOrders(List<Order> commOrders){
		double sumOrders=0;
		
		if (commOrders==null)
			return 0;
		for (Order o:commOrders)
			sumOrders += o.getOrderAmount(); 
		return sumOrders;
	}

}
