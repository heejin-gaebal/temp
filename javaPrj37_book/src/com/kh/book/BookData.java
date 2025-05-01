package com.kh.book;

public class BookData {
	private String title;
	private String author;
	private int price;
	
	public BookData(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public BookData() {
		super();
	}

	//title
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	//author
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	//price
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookData [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
}
