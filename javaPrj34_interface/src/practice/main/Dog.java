package practice.main;

public class Dog extends Animal implements AnimalAction {

	@Override
	public void cry() {
		System.out.println("왕왕");
	}

}
