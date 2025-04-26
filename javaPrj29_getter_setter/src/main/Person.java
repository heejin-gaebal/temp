package main;

public class Person {
	
	private String name;
	private int age;
	//양수 값만 사용가능
	
	public void setAge(int n) {
		if(n < 0) {
			System.out.println("양수만 가능");
			return;
		}
		this.age = n;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setName(String s) {
		this.name = s;
	}
	public String getName() {
		return this.name;
	}
	
	public String getInfo() {
		String x = name + " / " + age;
		return x;
	}
	
	/*
	 * set과 get을 쓰려고 하는 이유? 
	 * 프라이빗 변수를 직접 갖다 쓸 수 없기 때문에 
	 * set으로 값을 지정해주고 get으로 값을 받아와서 
	 * public에서 사용할 수 있게 하기 때문
	 */
	
	
}