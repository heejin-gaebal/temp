package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("======= Pokemon Game =======");
		
		// 포켓몬 3마리 생성
		Pokemon p1 = new Pokemon();
		Pokemon p2 = new Pokemon();
		Pokemon p3 = new Pokemon();
	
		// 객체 안의 멤버변수에 값 할당
		p1.name ="피카츄";
		p1.hp = 100;
		p1.atk = 10;
		
		p2.name ="꼬부기";
		p2.hp = 120;
		p2.atk = 5;

		p3.name ="파이리";
		p3.hp = 80;
		p3.atk = 15;
		
		//포켓몬 목록 출력 // 객체 값 확인
		p1.printInfo();
		p2.printInfo();
		p3.printInfo();
		
		//숫자 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 포켓몬 번호 입력 : ");
		int num = sc.nextInt();

		// 유저, 적 포켓몬 선택
		Pokemon user = null;
		Pokemon enemy = null;

		
		switch(num) {
		case 1 : 
			user = p1; 
			enemy = p2;
			break;
		case 2 : 
			user = p2;
			enemy = p3;
			break;
		case 3 : 
			user = p3;
			enemy = p1;
			break;
		}
				
		//battle
		while(user.hp > 0 && enemy.hp > 0) {			
			System.out.println("-------- Round --------");
			System.out.println(p1.name +" VS "+ p2.name );
			
			user.bodyAttack();
			enemy.bodyAttack();
				
			user.hp -= enemy.atk;
			enemy.hp -= user.atk;

			System.out.println("-------- Round END--------");
			user.printInfo();
			enemy.printInfo();
		}
		System.out.println("======= Game End =======");
	}

}
