package main;

public class Car {
	private String name;
	private int price;
	
	//생성자
	public Car() {
		
	}
//	------------------------------------------------
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public String getInfo() {
		return name + " | "+ price;
	}
}
