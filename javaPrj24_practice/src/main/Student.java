package main;

public class Student {
	
	//생성자
	public Student() {
		// 자동 생성되는데 굳이 만들어준 이유는??
	};

	//멤버 변수
	public String name;
	public int score;
	
	//멤버 메서드
	public void printInfo() {
		System.out.println(name + " / " + score);
	}
}
