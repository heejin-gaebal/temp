package statik.main;

public class Main {

	public static void main(String[] args) {
		System.out.println("====== static ======");
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		Person.name ="호랑이";	//클래스.변수_올바른 표현
		p1.age = 5;

		Person.name ="사자";			//객체.변수_사용불가
		p2.age = 7;
		
		System.out.println(Person.name);
		System.out.println(p1.age);

		System.out.println(Person.name);
		System.out.println(p2.age);
		
		Person.printInfo();	//클래스.메서드_올바른 표현
//		p1.m01();		//객체.메서드_사용불가
	}

}
