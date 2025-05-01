package book;

import java.util.Scanner;

public class BookController {

	private Scanner sc = new Scanner(System.in);
	private BookDao dao = new BookDao();

	//전체 작업 관리하는 메서드
	public void m01() {

		while(true) {
			printMenu();
			int num = scanMenuNum();
			if(num == 0) {
				System.out.println("시스템 종료");
				break;
			}
			callFunction(num);
		}
	}
	
	public void printMenu() {
		System.out.println("------ MENU ------");
		System.out.println("0. 프로그램 종료");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 목록");
		System.out.println("3. 도서 상세조회");
		System.out.println("4. 도서 수정");
		System.out.println("5. 도서 삭제");
	}
	
	public int scanMenuNum() {
		System.out.println("메뉴번호 : ");
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}
	
	public void callFunction(int num) {
		switch(num) {
		case 1 : insert(); break;
		case 2 : list(); break;
		case 3 : detailList(); break;
		case 4 : update(); break;
		case 5 : delete(); break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	//도서 등록
	public void insert() {	
		System.out.println("------- 도서 등록 -------");
		//data => object
//		BookVo x = new BookVo();
//		x.setTitle(sc.nextLine());
//		x.setAuthor(sc.nextLine());
//		x.setPrice(Integer.parseInt(sc.nextLine()));
		
		System.out.println("title : ");
		String title = sc.nextLine();
		System.out.println("author : ");
		String author = sc.nextLine();
		System.out.println("price : ");
		int price = Integer.parseInt(sc.nextLine());
		
		BookVo bookVo = new BookVo(title, author, price);
		
//		//save		
//		bookVoArr[cnt] = x;
		//Data Access Object - DAO
		dao.insert(bookVo); //bookVo를 넘겨주면서 호출
		System.out.println("!!도서 등록 완료!!");
	}
	
	//도서 목록
	public void list() {
		System.out.println("------- 도서 목록조회 -------");
		BookVo[] arr = dao.getBookVoArr();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == null) {
				break;
			}
			System.out.println(i + "번 도서 : " + arr[i].getTitle());
		}
		System.out.println("!!도서 목록조회 완료!!");
	}
	
	//도서 상세조회
	public void detailList() {
		System.out.println("------- 도서 상세 조회 -------");
		System.out.println("상세조회 할 도서번호");
		int num = Integer.parseInt(sc.nextLine());
		BookVo[] arr = dao.getBookVoArr();
		System.out.println(arr[num]);
		System.out.println("!!도서 상세 조회 완료!!");
	}
	
	//도서 수정
	public void update() {
		System.out.println("------- 도서 수정 -------");
		System.out.println("수정할 도서번호");
		BookVo[] arr = dao.getBookVoArr();
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.println("title : ");
		String title = sc.nextLine();
		System.out.println("author : ");
		String author = sc.nextLine();
		System.out.println("price : ");
		int price = Integer.parseInt(sc.nextLine());
		
		arr[num].setTitle(title);
		arr[num].setAuthor(author);
		arr[num].setPrice(price);
		System.out.println("!!도서 수정 완료!!");
	}
	
	//도서 삭제
	public void delete() {
		System.out.println("------- 도서 삭제 -------");
		BookVo[] arr = dao.getBookVoArr();
		
		System.out.println("삭제할 도서번호");
		int num = Integer.parseInt(sc.nextLine());
		
		//뒤에꺼 앞으로 당기기
		for(int i=num; i< arr.length-1; i++) {
			//현재값이 null 이면 불필요한 반복없도록
			if(arr[i] == null) {
				break;
			}
			arr[i] = arr[i+1];
			//length 기준으로 -2 앞으로 옮기기
		}
		//배열이 꽉찬 상태 : 마지막 요소 제거하기 위함
		arr[arr.length-1] = null;
		
		dao.minusCnt();

		System.out.println("!!도서 삭제 완료!!");
	}
}
