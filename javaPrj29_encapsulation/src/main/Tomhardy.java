package main;

public class Tomhardy {

	private String name;
	private String birth;
	private int height;
	
	public Tomhardy(String name, String birth, int height) {
		this.name = name;
		this.birth = birth;
		this.height = height;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public String toString() {
		return "4번 " + name + "의 생년월일은 " + birth + "이고, 키는" + height + "cm 입니다.";
	}
	
	
	
	
	
	
}
