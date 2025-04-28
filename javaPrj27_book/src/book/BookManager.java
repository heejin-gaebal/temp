package book;

import java.util.Scanner;

public class BookManager {

	private Scanner sc = new Scanner(System.in);
	private BookData[] BookArr = new BookData[10];
	private int cnt = 0;
	
//	생성자 안에 멤버변수를 넣는것이 더 효율적 할당 외에도 여러기능 할 수 있음
	
	public void work() {
		
		while(true) {
			//show menu
			printMenu();
			
			//숫자 입력받기
			int num = scanNumber();
			
			if(num == 0) {
				System.out.println("프로그램 종료");
				return;
			}
			
			//기능 수행
			processFunction(num);
		}
	}
	
	public void printMenu() {
		System.out.println("------ MENU ------");
		System.out.println("0. 프로그램 종료");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 목록 조회");
		System.out.println("3. 도서 상세 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 수정");
	}
	
	public int scanNumber() {
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();

		return num;
	}
	
	public void processFunction(int num) {
		switch (num) {
		case 1: 
			insert();
			break;
		case 2:
			printList();
			break;
		case 3: 
			printDetail();
			break;
		case 4: 
			delete();
			break;
		case 5: 
			update();
			break;
		default:
			System.out.println("잘못 누르셨습니다.");
		}
	}
	
	public void insert() {
		System.out.println("====== 도서 등록 ======");
		//데이터 입력받기
		System.out.println("title : ");
		String title = sc.nextLine();

		System.out.println("price : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		//데이터 객체로 뭉치기
		BookData data = new BookData();
		data.title = title;
		data.price = price;
		
		//데이터 (객체) 저장
		BookArr[cnt] = data;
		cnt++;

		System.out.println("//// 도서 등록 완료 ////");
	}
	//insert
	
	public void printList() {
		System.out.println("====== 도서 목록 조회 ======");
		
		for(int i=0; i<cnt; i++) {
			if(BookArr[i] == null) {
				continue;
			}
			BookArr[i].printInfo();			
		}
		System.out.println("//// 도서 조회 완료 ////");
	}
	//list
	
	public void printDetail() {
		System.out.println("====== 도서 상세 조회 ======");

		System.out.print("조회할 도서 번호 : ");
		
		int num = sc.nextInt();
		sc.nextLine();
		BookArr[num].printInfo();	
		
		System.out.println("//// 도서 상세조회 완료 ////");
	}
	//detail
	
	public void delete() {
		System.out.println("====== 도서 삭제 ======");

		System.out.print("삭제할 도서 번호 : ");

		int num = sc.nextInt();
		sc.nextLine();
		
		BookArr[num] = null;	
		System.out.println("//// 도서 삭제 완료 ////");
	}
	//delete
	
	public void update() {
		System.out.println("5");
		
	}
	//update

}
