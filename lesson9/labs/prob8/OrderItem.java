package lesson9.labs.prob8;

import java.util.Optional;

public class OrderItem {
	private Product product;
	private Integer quantityRequested;
	private double totalPrice;
	//package level constructor
	OrderItem(Product product, Integer quantity) {
		this.product = product;
		this.quantityRequested = quantity;
		totalPrice = this.product.getUnitPrice().get() * quantity;
	}
	@Override
	public String toString() {
		return "   " + product.getProductId() + ": " + quantityRequested + ", " + product.getUnitPrice();
	}
	public Optional<Product> getProduct() {
		return Optional.ofNullable(product);
	}
	public Optional<Integer> getQuantityRequested() {
		return Optional.ofNullable(quantityRequested);
	}
	public Optional<Double> getTotalPrice() {
		return Optional.ofNullable(totalPrice);
	}
	
}
