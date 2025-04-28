package main;

public class Book {
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
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

	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	
	//생성자 자동완성
	/*
	 * 우클릭 - 소스 - 
	 */
	
}

