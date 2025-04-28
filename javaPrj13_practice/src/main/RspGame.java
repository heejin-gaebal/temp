package main;

import java.util.Scanner;

public class RspGame {

	public static void main(String[] args) {
		System.out.println("===== RspGame =====");
		
		System.out.println("가위바위보 게임");		
		System.out.println("가위바위보 게임입니다. 가위,바위,보 중에 하나를 골라주세요");
		Scanner sc = new Scanner(System.in);
		//컴퓨터의 랜덤값 | 유저입력 | 이기는 경우의 수
		
		int win = 0;
		int lose = 0;
		int draw = 0;
		int maxWin = 0;
		int temp = 0;
		
		while(true) {
			String user = sc.nextLine();
			
			if(user.equals("그만")) {
				break;
			}

			//컴퓨터의 랜덤값
			int random = (int)(Math.random() * 3 + 1);
			
			String com ="";
			switch(random) {
			case 1 : com = "가위"; break;
			case 2 : com = "바위"; break;
			case 3 : com = "보"; break;
			}
			
			//결과 출력
			System.out.println("유저 : " + user);
			System.out.println("컴퓨터 : " + com);
			
			//유저가 이기거나 비기거나 지는 경우의 수
			if(user.equals("가위") && com.equals("보") || user.equals("바위") && com.equals("가위") || user.equals("보") && com.equals("바위")) {
				System.out.println("Win~~!!");
				win++;
				temp++;
				if(maxWin < temp) {
					maxWin = temp;
				}
			}else if(user.equals("가위") && com.equals("바위") || user.equals("바위") && com.equals("보") || user.equals("보") && com.equals("가위")) {
				System.out.println("Lose~..");	
				lose++;
				temp = 0;
			}else{
				System.out.println("Draw,,,");
				draw++;
				temp = 0;
			}
		}
		System.out.println("게임이 끝났습니다.");
		System.out.println("------ 전적 ------");
		System.out.println("승리횟수 : " + win);
		System.out.println("패배횟수 : " + lose);
		System.out.println("무승부횟수 : " + draw);
		System.out.println("최대 연승횟수 : " + maxWin);
	}
}
