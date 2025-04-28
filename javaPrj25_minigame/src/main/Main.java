package main;

import game.Gamemanager;

public class Main {

	public static void main(String[] args) {
		System.out.println("============ MINI GAME ============");
		
		Gamemanager gm = new Gamemanager();
		
		while(true) {
			boolean isStop = gm.play(); 
			//반복 멈추기
			if(isStop) {
				break;
			}
		}
	}
}


