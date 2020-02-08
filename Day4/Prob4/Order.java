package Day4.Prob4;

import java.util.Date;

public class Order {
	private int orderNo;
	private Date orderDate;
	private double orderAmount;
	private Employee EmpComm;
	
	private Order() {
	}	
	public Order(Employee emp) {
		this.EmpComm = emp;
	}
	public Order(Employee emp,int orderNo, Date orderDate, double orderAmount) {
		this.EmpComm = emp;
		this.orderNo=orderNo;
		this.orderDate=orderDate;
		this.orderAmount=orderAmount;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

}
