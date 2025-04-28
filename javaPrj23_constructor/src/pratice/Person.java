package pratice;

public class Person {
	//4개의 생성자 만들기
	
	//기본 생성자						
	public Person() {
		
	}
	
	//이름 받음
	public Person(String name) {
		this.name = name;
	}
	//나이 받음
	public Person(int age) {
		this.age = age;
	}
	
	//이름, 나이 받아서 필드에 할당
	//생성자 만들기 : 접근제한자 클래스명(파라미터){실행내용}
	public Person(String a, int b) {
		//현재 객체의 변수
		this.name = a;
		this.age = b;
	}
	
	public String name;
	public int age;
}
