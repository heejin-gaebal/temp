package main;

public class Person {
	
	//생성자
//	접근제한자 x리턴타입x 메서드이름(파라미터) {실행내용}
	public Person() {
		System.out.println("생성자 호출됨");
		this.name ="홍길동"; 
		//this. 현재 객체의 name | this.는 생략해도됨 
	};
	
	String name;
	int age;

	public void printInfo() {
		
	}
}
