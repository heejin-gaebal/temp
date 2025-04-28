package main;

public class Ticket {
	
	private String departure;
	private String arrival;
	private int price;
	
	public Ticket(String depart, String arrv, int price) {
		this.departure = depart;
		this.arrival = arrv;
		this.price = price;
	}

	public String getDepart() {
		return departure;
	}
	public void setDepart(String depart) {
		this.departure = depart;
	}

	public String getArrv() {
		return arrival;
	}
	public void setArrv(String arrv) {
		this.arrival = arrv;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "4번 " + "출발지는 " + departure + ", 도착지는 " + arrival +
				"인 티켓 가격은 " + price + "만원 입니다.";
	}
	
	
	
}
