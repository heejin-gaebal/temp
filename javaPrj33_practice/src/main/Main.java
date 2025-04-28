package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("====== Animal ======");
		
		//generate + set value
		Dog x = new Dog("마루", 3);
		Cat y = new Cat("첨지", 2);
		
		//print object
		System.out.println(x);
		System.out.println(y);
	}

}
