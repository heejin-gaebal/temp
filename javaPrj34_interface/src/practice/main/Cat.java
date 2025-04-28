package practice.main;

public class Cat extends Animal implements AnimalAction{

	@Override
	public void cry() {
		System.out.println("먀옹");
	}
	
}
