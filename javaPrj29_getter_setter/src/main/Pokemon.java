package main;

public class Pokemon {
	private String name;
	private int hp;
	private int atk;
	
	//name
	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	//hp
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHp() {
		return this.hp;
	}
	
	//atk
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getAtk(){
		return this.atk;
	}
}
