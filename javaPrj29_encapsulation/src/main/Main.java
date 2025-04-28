package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("============ encapsulation ============");
		
		Class c = new Class("박희진", 123456, "방송부");
		System.out.println(c);
		
		System.out.println("------------------------------------------------");
		
		Shop s = new Shop("책상", 58320, 58.32);
		System.out.println(s);

		System.out.println("------------------------------------------------");
		
		Animal a = new Animal("나무늘보", 6, false);
		System.out.println(a);
		
		System.out.println("------------------------------------------------");
		
		Ticket t = new Ticket("Incheon", "Milano", 130);
		System.out.println(t);
		
		System.out.println("------------------------------------------------");
		
		Tomhardy tom = new Tomhardy("Tom Hardy", "770915", 175);
		System.out.println(tom);
	}

}
