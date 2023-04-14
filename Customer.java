package model;

public class Customer {
	
	private String name;
	private Order[] orders;
	
	// constructors
	
	public Customer() {
		
	}
	
	public Customer(String name, Order[] orders) {
		this.name = name;
		this.orders = orders;
	}
	
	// functions
	
	public String getInfo() {
		String display = "Name: " + name;
		for (Order order : orders) {
			display += order.getInfo();
		}
		return display;
	}
	
	public double getTotalAmountOrders() {
		double sum = 0;
		for (Order order : orders) {
			sum += order.getTotalPrice();
		}
		return sum;
	}

	// getters and setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Order[] getOrders() {
		return orders;
	}

	public void setOrders(Order[] orders) {
		this.orders = orders;
	}
	
	
}
