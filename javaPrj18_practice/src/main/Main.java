package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("======= Person =======");
		
		Person x = new Person();
		
		//객체가 가진 변수 다루기
		x.name ="박희진";
		x.age = 18;
		x.blood = 'A';
		x.mbti ="ENFP";
		x.study = true;
		
		System.out.println(x.name);
		System.out.println(x.age);
		System.out.println(x.blood);
		System.out.println(x.mbti);
		System.out.println(x.study);
		
		//객체가 가진 메서드 다루기
		x.sayHi();
		x.eat();
		
		
	}

}
