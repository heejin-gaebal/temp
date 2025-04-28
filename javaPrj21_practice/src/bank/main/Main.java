package bank.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("======= MANAGE BANK ACCOUNT =======");
		Scanner sc = new Scanner(System.in);
		
		//여러 계좌 관리를 위한 배열
		Account[] x = new Account[10];
		
		int cnt = 0;	//계좌 등록시, 1 증가
		
		while(true) {
			System.out.println("0. 종료");
			System.out.println("1. 등록");
			System.out.println("2. 목록");
			System.out.print("원하시는 메뉴 번호 : ");
			int input = sc.nextInt();
			sc.nextLine();
						
			//입력에 따른 동작 수행
			switch(input) {
			case 0 :
				//return; : return 을 불렀던곳으로 되돌아감 - 메인메서드
				System.out.println("프로그램이 종료됩니다.");
				return; 
			case 1 :
				//계좌 정보 등록
							//입력
				System.out.print("name : ");
				String name = sc.nextLine();
				System.out.print("money : ");
				long money = sc.nextLong();
				sc.nextLine();
				
				//객체생성
//				Account a = new Account();
				//객체에 저장
//				a.name = name; 
//				a.money = money;
						//지역변수 name/money - 입력받은 name/money
				
				x[cnt] = new Account(); //cnt = 0으로 하고 배열[0]자리에 저장
				//객체에 저장
				x[cnt].name = name; 
				x[cnt].money = money;
				
				cnt++; // 카운트 증가
				break;
			case 2 :
				//계좌 정보 출력
				for(int i=0; i<cnt; i++) {
//					if(x[i] != null) {		
//						// null 아닐때만 출력
						x[i].printInfo();						
//					}
				}
				break;
			default : System.out.println("잘못 입력하셨습니다."); 
			}
		}
	}

}
