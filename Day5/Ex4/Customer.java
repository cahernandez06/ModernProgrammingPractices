package Day5.Ex4;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Order> orders;
	protected Customer(String name) {
		this.name = name;
		orders = new ArrayList<Order>();	
	}
	protected Customer(String name, List<Order> ords) {
		if (ords==null||name==null||name.isEmpty())
			throw new IllegalArgumentException("Invalid arguments to create customer");
		this.name = name;
		this.orders = ords;
	}
	public void addOrder(Order order) {
		orders.add(order);
	}
	public String getName() {
		return name;
	}
	public List<Order> getOrders() {
		return orders;
	}
}
