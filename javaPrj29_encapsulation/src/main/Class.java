package main;

public class Class {
	
	private String name;
	private int stuNum;
	private String club;
	
	public Class(String name, int stuNum, String club) {
		this.name = name;
		this.stuNum = stuNum;
		this.club = club;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}

	public String toString() {
		return "1번 " + name + "의 학번은 " + stuNum + "이고, 동아리는 " + club + "입니다.";
	}
	
	
	
	
}
