package Day5.Ex4;

import java.time.LocalDate;
import java.util.ArrayList;

public class CustOrderFactory {
	
	public static Customer createCustomer(String name) {
		if (name==null||name.isEmpty())
			throw new IllegalArgumentException("Customer name cannot be null");
		return new Customer(name);
	}
	
	public static Order newOrder(Customer cus, LocalDate orderDate) {
		if (cus==null)
			throw new IllegalArgumentException("Order's Customer cannot be null");
		Order o = new Order(orderDate);
		cus.addOrder(o);
		return o;
	}
	public static Item addItem(Order o, String name) {
		if (name==null||name.isEmpty()||o==null)
			throw new IllegalArgumentException("Item arguments cannot be null");
		Item i = new Item(name);
		o.addItem(i);
		return i;
	}


}
