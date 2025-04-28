package bank.main;

public class Account {

	//고객이름, 잔액
	String name;
	long money;
	
	public void printInfo() {
		System.out.println(name +" "+ money);
	}
}
