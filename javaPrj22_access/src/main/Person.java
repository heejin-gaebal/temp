package main;

// 클래스의 접근제한자는 public 과 default 를 주로 씀
// private 으로 두면 아예 사용할 수 없기에 쓰지 않음
public class Person {

	// 필드값의 접근제한자를 안쓰면 default
	// 필드값의 접근제한자를 private 로 하면 메인에서 접근못함
	
	public /*private*/ String name;
	int age;
	
}
