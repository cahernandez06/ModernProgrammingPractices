package Day5.Ex4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {
	private LocalDate orderDate;
	private List<Item> items;
	private Customer cust;
	
	
	//use a factory method
	Order(LocalDate orderDate) {
		this.orderDate = orderDate;
		items = new ArrayList<Item>();	
	}
	/*public Order newOrder(Customer cust, LocalDate date) {
		if(cust == null) throw new NullPointerException("Null customer");
		Order ord = new Order(date);
		cust.addOrder(ord);
		this.cust=cust;
		return ord;
	}*/
	public void addItem(Item i){
		items.add(i);
	}
	@Override
	public String toString() {
		return orderDate + ": " + 
	              items.toString();
	}
}
