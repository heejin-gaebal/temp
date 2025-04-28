package main;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		System.out.println("===== 가위바위보 =====");

		Scanner sc = new Scanner(System.in);
		
		int wincnt = 0;
		int losecnt = 0;
		int drawcnt = 0;
		int maxwincnt = 0;
		int temp = 0;
		
		while(true) {
			//유저입력 (문자열) - sc.nextLine() : 엔터키까지를 한줄로 인식하고 출력
							 //sc.next() : 스페이스바까지 출력 
			System.out.println("가위, 바위, 보 중에 하나를 입력해주세요");
			String user = sc.nextLine();
			
			if(user.equals("그만")) {
				break;
			}
			
			//컴퓨터 랜덤값 설정
			int random = (int)(Math.random() * 3 + 1);
					   // 먼저 실행()처리 그후 (int)형변환
			
			String com = "";
			
			switch(random) {
			case 1 : 
				com = "가위";
				break;
			case 2 : 
				com = "바위";						
				break;
			case 3 : 
				com = "보";
				break;
			}
			
			//결과 출력(승 무 패)
			System.out.println("유저 : " + user);
			System.out.println("컴퓨터 : " + com);
			
			//결과 출력(승 무 패) 
			// || : 둘 중 하나를 만족할 때	"OR"
			// && : 두개 다 만족할 때		"AND 우선순위!"
			if(user.equals("ㅇ") || user.equals("가위") && com.equals("보")|| user.equals("바위") && com.equals("가위") || user.equals("보") && com.equals("바위")) {
				System.out.println("User WIN!!!");			
				wincnt++;
				temp++;
				if(maxwincnt < temp) {
					maxwincnt = temp; // temp 값이 더 크면 실행
				}
			}else if(user.equals("가위") && com.equals("바위")|| user.equals("바위") && com.equals("보") || user.equals("보") && com.equals("가위")) {
				System.out.println("User LOSE..");
				losecnt++;
				temp = 0; 
			}else {
				System.out.println("---DRAW---");
				drawcnt++;
				temp = 0;
			}
		}
		System.out.println("게임을 끝냈습니다.");
		System.out.println("======= 전적 =======");
		System.out.println("승리 횟수 : " + wincnt);
		System.out.println("패배 횟수 : " + losecnt);
		System.out.println("무승부 횟수 : " + drawcnt);
		System.out.println("최대 연승 횟수 : " + maxwincnt);
	}
}
