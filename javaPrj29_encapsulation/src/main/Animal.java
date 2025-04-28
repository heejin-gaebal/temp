package main;

public class Animal {
	
	private String name;
	private int age;
	private boolean hurt;
	
	public Animal(String name, int age, boolean hurt) {
		this.name = name;
		this.age = age;
		this.hurt = hurt;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHurt() {
		return hurt;
	}
	public void setHurt(boolean hurt) {
		this.hurt = hurt;
	}

	public String toString() {
		return "3번 " + "관리할 동물은 " + name + "이고, 나이는 " + age + "살이고, 검진기록 이상 유무는 " + hurt;  
	}
	
	
	
	
	
}
