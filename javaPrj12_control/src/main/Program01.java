package main;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		//가위 바위 보
		//1 : 가위, 2 : 바위, 3 : 보
	
		System.out.println("===== 가위바위보 =====");
		
		//승패 카운트
		int Wincnt = 0;
		int Losecnt = 0;
		int Drawcnt = 0;
		
		while(true) {
			//유저 값 입력
			Scanner sc = new Scanner(System.in);
			System.out.println("1 : 가위, 2 : 바위, 3 : 보 중 하나를 선택하세요");
			int user = sc.nextInt();
			
			if(user==0) {
				break;
			}
			
			//컴퓨터 값 입력 (랜덤 설정)
			int com = (int)(Math.random() * 3 + 1);
			
			//결과 출력 (각각의 손 출력)
			switch(user) {
			case 1 : System.out.println("유저 : 가위"); break;
			case 2 : System.out.println("유저 : 바위"); break;
			case 3 : System.out.println("유저 : 보"); break;
			}

			switch(com) {
			case 1 : System.out.println("컴퓨터 : 가위"); break;
			case 2 : System.out.println("컴퓨터 : 바위"); break;
			case 3 : System.out.println("컴퓨터 : 보"); break;
			}
					
			//결과 출력 (승패판정)
			// 가위일때
			if(user==1 && com == 3 || user==2 && com == 1 || user==3 && com == 2) {
				Wincnt++;
				System.out.println("WIN");			
			}else if(user==1 && com == 2 || user==2 && com == 3 || user==3 && com == 1){
				Losecnt++;
				System.out.println("LOSE");			
			}else if(user==1 && com == 1 || user==2 && com == 2 || user==3 && com == 3){
				Drawcnt++;
				System.out.println("DRAW");			
			}
			
			//결과 출력(전적)
			System.out.println("WIN" + Wincnt);
			System.out.println("LOSE" + Losecnt);
			System.out.println("DRAW" + Drawcnt);
		}
		
		System.out.println("가위바위보 게임이 끝났습니다");
		
	}

}
