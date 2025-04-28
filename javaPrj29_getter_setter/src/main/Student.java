package main;

public class Student {
	
	private String name;
	private int score;
	
	private char grade;
	private boolean isStudy;
	private double height;
	private double weight;	
	
	//name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	//score
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return this.score;
	}
	
	//grade
	public void setGrade(char a) {
		this.grade = a;
	}
	public char getGrade(){
		return this.grade;
	}
	
	//isStudy
	public void setisStudy(boolean b) {
		this.isStudy = b;
	}
	public boolean getisStudy(){
		return this.isStudy;
	}
	
	//height
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight(){
		return this.height;
	}

	//weight
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight(){
		return this.weight;
	}
	
}