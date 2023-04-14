package model;

public class Product {
	
	private String name;
	private double price;
	private double tax;
	
	// constructors
	
	public Product() {
		
	}
	
	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
	
	// functions
	
	public String getInfo() {
		String display = "Name: " + name + "\n" + "Price: " + price + "\n" + "Tax: " + tax; 
		return display;
	}
	
	public double GrrossPrice() {
		return price + price*tax;
	}

	//  getters and setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
