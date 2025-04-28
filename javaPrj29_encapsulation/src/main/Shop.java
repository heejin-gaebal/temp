package main;

public class Shop {
	private String name;
	private int price;
	private double point;
	
	public Shop(String name, int price, double point) {
		this.name = name;
		this.price = price;
		this.point = point;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}

	public String toString() {
		return "2번 " + name + "의 가격은 " + price + "입니다. 적립포인트는 " + point + "입니다.";
	}
	
	
	
	
}
