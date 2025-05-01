package main;

import java.util.Scanner;

public class Main {

	//고정값
	public static final Scanner SC = new Scanner(System.in);
	
	public static void main(String[] args) {

		while(true) {
			System.out.println("====== 미니게임 ======");
			System.out.println("1. 업다운");
			System.out.println("2. 가위바위보");
			System.out.println("3. 카드게임");
			
			System.out.print("게임 번호 입력 : ");
			int num = Integer.parseInt(SC.nextLine());
			
			switch(num) {
			case 1 : new UpdownThread().start();	break;
			case 2 : new RspThread().start();		break;
			case 3 : new CardThread().start();		break;
			default : System.out.println("잘못 누르셨습니다.");
			}
		}
	}

}
