package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("====== CLASS ======");
		
		/*
		 * 클래스, 객체
		 * 
		 * new Student (); - 클래스 생성/선언 
		 * 					 중복가능 또 하나의 클래스 객체 생성. 변수를 붙여줌
		 * 클래스와 객체의 차이 : 클래스는 붕어빵의 틀 | 객체는 붕어빵 여러개 가능~
		 * 
		 * 사람 [눈2,코1,입1]
		 * 
		 * class Student (String name, int score) {}
		 *:Student 클래스객체 (멤버변수)
		 *
		 */
	 	/*
		 * 	Person      a = new Person();
			  타입지정(주소값) 변수 	객체 생성
				a.name = "홍길동";
				a.age = 20;
				System.out.println(a.name);
				System.out.println(a.age);
				
				
			객체 : member 로 구성
				  member 는 2종류 - 변수 variable | 메서드 method
				  
		 */
		
		Pokemon p1 = new Pokemon();
		p1.name = "이브이";
		p1.hp= 100;
		p1.atk = 10;

		Pokemon p2 = new Pokemon();
		p2.name = "파이리";
		p2.hp= 120;
		p2.atk = 5;
		
		System.out.println("====== Pokemon 1 ====== ");
		System.out.println(p1.name);
		System.out.println(p1.hp);
		System.out.println(p1.atk);

		System.out.println("====== Pokemon 2 ====== ");
		System.out.println(p2.name);
		System.out.println(p2.hp);
		System.out.println(p2.atk);
		
		System.out.println("----------- 1 Round -----------");
		p1.hp -= p2.atk; //이브이 체력 - 파이리 공격
		p2.hp -= p1.atk; //파이리 체력 - 이브이 공격
		
		System.out.println("====== Pokemon 1 ====== ");
		System.out.println(p1.name);
		System.out.println(p1.hp);
		System.out.println(p1.atk);

		System.out.println("====== Pokemon 2 ====== ");
		System.out.println(p2.name);
		System.out.println(p2.hp);
		System.out.println(p2.atk);
	}

}
