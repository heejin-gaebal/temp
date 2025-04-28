package practice.main;

public class Main {

	public static void main(String[] args) {

		System.out.println("====== 상속, 인터페이스 연습 ======");
		
		Animal x = new Dog();
		x.setName("바둑이");
		x.setAge(3);
		
		Animal y = new Cat();
		y.setName("나비");
		y.setAge(2);
		
		System.out.println(x);
		System.out.println(y);
		
		((AnimalAction)x).cry();
		((AnimalAction)y).cry();
	}

}
