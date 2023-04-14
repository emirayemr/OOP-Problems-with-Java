package model;

import java.time.LocalDateTime;

public class Order {
	
	private int id;
	private OrderItem[] orderItems;
	private LocalDateTime date;
	
	// constructors
	
	public Order() {
		
	}
	
	public Order(int id, OrderItem[] orderItems, LocalDateTime date) {
		this.id = id;
		this.orderItems = orderItems;
		this.date = date;
	}
	
	// functions
	
	public String getInfo() {
		String display = "\nid: " + id + "\n------------\n";
		for (OrderItem orderItem : orderItems) {
			display += orderItem.getInfo() + "\n";
		}
		display += "\n------------";
		return display;
	}
	
	public double getTotalPrice() {
		double totalPrice = 0;
		for(OrderItem orderItem : orderItems) {
			totalPrice += orderItem.getItemTotalPrice();
		}
		return totalPrice;
	}

	// getters and setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public OrderItem[] getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(OrderItem[] orderItems) {
		this.orderItems = orderItems;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	
}
