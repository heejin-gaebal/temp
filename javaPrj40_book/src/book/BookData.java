package book;

public class BookData {
	
	private String title;
	private int price;
	
	public BookData() {
		super();
	}
	
	public BookData(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	//title
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
		return "BookData [title=" + title + ", price=" + price + "]";
	}
}
