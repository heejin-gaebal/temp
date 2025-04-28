package main;

public abstract class Animal {
	
	int a;

	String name;
	int age;
	
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	
	public abstract void cry();
	/*
	 * 인터페이스 : 추상메서드에만 있음
	 * 바디가 없는 메서드 : 추상메서드
	 * 오버라이드 :
	 * 	부모에게 추상메서드가 있다면 자식도 무조건 덮어쓰기되야함
	 *
	 * 상속 : 부모클래스의 내용 자식한테 전달
	 *
	 * 추상메서드 : 메서드 바디가 없음
	 * - 오버라이딩 강제화
	 * - 다형성 적용
		 좀 더 범용적인 타입을 사용하는게 유연한 코딩을 하게 됨
		 다형성 적용하면 정적바인딩 문제 생김
		 문제해결하려고 메서드 선언
		 메서드 바디는 굳이 필요없이 추상메서드로 작성
	 *
	 * 추상클래스 : 객체 생성불가능
	 */
}
