package model;

public class OrderItem {
	
	private Product product;
	private double amount;
	
	// constructors
	
	public OrderItem() {
		
	}
	
	public OrderItem(Product product, double amount) {
		this.product = product;
		this.amount = amount;
	}
	
	// functions
	
	public String getInfo() {
		String display = product.getInfo() + "\nAmount: " + amount;
		return display;
	}
	
	// getters and setters
	
	public double getItemTotalPrice() {
		return amount * product.getPrice();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
