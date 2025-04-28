package main;

//다른 패키지에 있는거 가져다 쓰기 import 해주기
import student.Student;

public class Main {

	public static void main(String[] args) {

		System.out.println("====== 접근제한자 ======");
		
		/*
		 * public 		: 어디서든 접근 가능
		 * protected	: 상속 관계에서 접근 가능
		 * default		: 같은 패키지 내에서 접근 가능
		 * private		: 같은 클래스 내에서만 접근 가능
		 */
		
//		Person p = new Person();
//		System.out.println(p.name);
//		System.out.println(p.age);
		
		// 다른패키지의 클래스는 기본적으로 사용할 수 없음 - import 해줌
		
//		Student s = new Student();
//		System.out.println(s.name);
	}

}
