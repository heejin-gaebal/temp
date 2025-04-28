package game;

import java.util.Scanner;

public class Gamemanager {

	//생성자[클래스랑 이름이 같음] - 자동 
	public Gamemanager() {
//		this.a = new updownManager();
		a = new updownManager();
		b = new RspManager();
		c = new pokemonManager();
	}
	//멤버 변수
	updownManager a = new updownManager(); //계속 살려주기 위해 클래스 선에서 변수 설정
	RspManager b = new RspManager();
	pokemonManager c = new pokemonManager();
	
	//멤버 메서드 - 게임을 주관하는 메서드
	public boolean play() {
		//메뉴판 호출
		printMenu();
		
		//유저 입력받기 호출
		int num = scanUserNum(); 
		//return 으로 num 값을 받아서 새로운 num 변수에 담아준다 새 num = num 의 값
		
		//num 이 0이면, 그만하기
		if(num == 0) {
			System.out.println("게임이 종료되었습니다.");
			return true;
		}
		
		//num 값에 따라, 해당 게임 실행
		startGame(num); //넘어온 num 값으로 startGame()에 파라미터를 넣어준다 
		
		return false;
	}
	
	
	//메뉴판 목록 보여주기
	private void printMenu(){
		//게임매니저에서만 보여지는 메서드이므로 private 사용해도 됨 
		//다만, 이 생성자를 사용해야할 경우가 생길 시 추후에 수정해도 된다.
		System.out.println("------ 미니게임 시작합니다. ------");
		System.out.println("0. 게임 종료");
		System.out.println("1. 업다운");
		System.out.println("2. 가위바위보");
		System.out.println("3. 포켓몬");
	}

	//유저 입력받기
	private int scanUserNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 게임 번호 선택 : ");
		int num = sc.nextInt();
		sc.nextLine();
		return num; //num 값을 호출한곳으로 보내준다.
	}
	
	//num 값에 따라, 해당 게임 실행
	public void startGame(int num) {// 파라미터를 넣어줬으므로 똑같이 타입 맞춰준다
		switch(num) { //switch 문에 조건으로 scanUserNum이 와도 된다.  
		case 1 :
//			new updownManager().gameStart(); //생략식
//			updownManager updownManager = new updownManager(); 
			// 여기 두면 계속 생성되어 쓰고 버리는 일회용 취급이 되므로, 남겨두기 위해 위로 이동 
			// 성능저하 : 메모리,시간,자원 낭비 
			a.gameStart();
			break;
		case 2 : 
			b.gameStart();
			break;
		case 3 : 
			c.gameStart();
			break;
		default : System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}
}
