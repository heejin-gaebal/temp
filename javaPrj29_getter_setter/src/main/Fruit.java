package main;

public class Fruit {
	
	private String name;
	private int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getInfo() {
		return name +" | "+ price;
	}
}
