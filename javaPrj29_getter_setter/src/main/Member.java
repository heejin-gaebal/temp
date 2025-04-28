package main;

public class Member {
	private String id;
	private String pwd;
	private String nick;
	private String address;
	private String mbti;
	private char blood;
	private int age;
	private double weight;
	private double height;
	private char gender;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public void setAddress(String addr) {
		this.address = addr;
	}
	public void setMbti(String mbti) {
		this.mbti = mbti;
	}
	public void setBlood(char blood) {
		this.blood = blood;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getId() {
		return this.id;
	}
	public String getPwd() {
		return this.pwd;
	}
	public String getNick() {
		return this.nick;
	}
	public String getAddress() {
		return this.address;
	}
	public String getMbti() {
		return this.mbti;
	}
	public char getBlood() {
		return this.blood;
	}
	public int getAge() {
		return this.age;
	}
	public double getWeight() {
		return this.weight;
	}
	public double getHeight() {
		return this.height;
	}
	public char getGender() {
		return this.gender;
	}
	
}
