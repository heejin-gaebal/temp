package member;

import java.util.Scanner;

public class MemberManager {
	private Scanner sc = new Scanner(System.in);
	private MemberData[] memberDataArr = new MemberData[10];
	private int cnt = 0;

	//메뉴판
	public void menu() {
		
		while(true) {
			printMenu();
			int num = scanInput();
			if(num == 0) {
				break;
			}
			callFunction(num);
		}
	}
	
	private void printMenu() {
		System.out.println("====== MENU ======");
		System.out.println("0. 프로그램 종료");
		System.out.println("1. 회원 등록");
		System.out.println("2. 회원 목록");
		System.out.println("3. 회원 상세조회");
		System.out.println("4. 회원 수정");
		System.out.println("5. 회원 삭제");
	}
	
	public int scanInput() {
		System.out.println("메뉴 번호 입력 : ");
		String a = sc.nextLine();
		int input = Integer.parseInt(a);
		return input;
		//인티저 클래스 안에 있는 파스인트라는 스태틱 메서드 호출
		//해당 데이터를 int 형으로 바꿔줌
	}

	public void callFunction(int x) {
		switch(x) {
		case 1 : insertMember();
			break;
		case 2 : printMemberList();
			break;
		case 3 : printMemberDetail();
			break;
		case 4 : updateMember();
			break;
		case 5 : deleteMember();
			break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	//회원 등록
	private void insertMember() {
		System.out.println("---- 회원등록 ----");
		
		try {
			//data
			String name = scanMemberName();
			int age = scanMemberAge();
			
			System.out.println("addr : ");
			String addr = sc.nextLine(); 
			System.out.println("phone : ");
			String phone = sc.nextLine();
			
			//data => object
			MemberData memberData = new MemberData(name, age, addr, phone);
			
			//save
			memberDataArr[cnt] = memberData;
			cnt++;
			
			System.out.println("회원등록 완료!");
			
		}catch(Exception e) {
			//잘못된 값이 들어온 경우 
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("회원 등록 실패");
		}
	}
	
	//회원 이름값 검사
	public String scanMemberName() throws Exception{ //강제 예외발생 시키므로 메소드에 명시
		System.out.println("name : ");
		String name = sc.nextLine();
		if(name.length() == 0) {
			throw new Exception(); //강제 예외발생
		}if(name.length() > 20) {
			throw new Exception(); //강제 예외발생
		}
		return name;
	}
	
	public int scanMemberAge() throws Exception{
		System.out.println("age : ");
		int age = Integer.parseInt(sc.nextLine());
		if (age < 0 || age > 200) {
			throw new Exception();
		}
		return age;
	}
	
	//회원 목록조회
	private void printMemberList() {

		for(int i=0; i < cnt; i++) {
			System.out.println(i + "번 회원 : " + memberDataArr[i].getName());
		}
	}
	
	//회원 상세조회
	private void printMemberDetail() {
		System.out.println("상세조회 할 회원번호 : ");
		int idx = Integer.parseInt(sc.nextLine());
		System.out.println(memberDataArr[idx]);
	}
	
	//회원 수정
	private void updateMember() {
		System.out.println("수정할 회원번호 : ");
		int num = Integer.parseInt(sc.nextLine());

		System.out.println("name : ");
		String a = sc.nextLine();
		System.out.println("age : ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("addr : ");
		String c = sc.nextLine();
		System.out.println("phone : ");
		String d = sc.nextLine();
		
		memberDataArr[num].setName(a);
		memberDataArr[num].setAge(b);
		memberDataArr[num].setAddr(c);
		memberDataArr[num].setPhone(d);
	}
	
	//회원 삭제
	private void deleteMember() {
		System.out.println("삭제할 회원 번호 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		//배열 재정렬 : 앞 요소 지우고 뒷 요소를 당기기
		for(int i=0; i<=cnt-2; i++) {
			memberDataArr[i] = memberDataArr[i+1];
		}
		
		memberDataArr[cnt-1] = null;
		
		cnt--;
	}
}


















