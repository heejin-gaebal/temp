package main;

public class Pokemon {
	String name;
	int hp;
	int atk;
	
	public void printInfo() {
		System.out.println(name +" "+ hp + " "+ (atk));
	}

	public void bodyAttack() {
		System.out.println(name +" 의 몸통박치기~!!!");
	}
}
