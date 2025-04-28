package main;

public class Main {

	public static void main(String[] args) {

		System.out.println("====== constructor 생성자 ======");
		
		/*
		 * 생성자 : 객체 생성에 사용되는 특수한 메서드
		 * <특징>
		 * - 클래스 이름과 동일한 이름을 가짐
		 * - 리턴타입 X
		 * - 객체를 만들어서 리턴함
		 * - 오버로딩 가능
		 */
		
		Person p = new Person();
//		p.name = "홍길동";
		System.out.println(p.name);
	}

}
