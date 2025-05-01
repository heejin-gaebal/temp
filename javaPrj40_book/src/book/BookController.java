package book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookController {

	private Scanner sc = new Scanner(System.in);
	//제네릭 추가 : BookData만 넣을 수 있음
	private List<BookData> bookList = new ArrayList<BookData>();
//	BookDao dao = new BookDao();

	//메뉴
	public void menu() {
		int num = -1;
		while(num != 0) {
			printMenu();
			num = scanInput();
			callFunction(num);
			if(num == 0) {
				System.out.println("프로그램 종료합니다.");
				break;
			}
		}
	}
	public void printMenu() {
		System.out.println("----- MENU -----");
		System.out.println("0. 프로그램 종료");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 목록조회");
		System.out.println("3. 도서 상세조회");
		System.out.println("4. 도서 수정");
		System.out.println("5. 도서 삭제 ");
	}
	public int scanInput() {
		System.out.println("메뉴번호 : ");
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}
	public void callFunction(int num) {
		switch(num) {
		case 1 : insertBook(); break;
		case 2 : selectBookList(); break;
		case 3 : selectBookOne(); break;
		case 4 : updateBook(); break;
		case 5 : deleteBook(); break;
		default : System.out.println("잘못 입력하셨습니다."); break;
		}
	}
	
	//도서 등록
	private void insertBook() {
		//data
		System.out.println("제목 : ");
		String title = sc.nextLine();
		System.out.println("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		//date -> object
		BookData x = new BookData(title, price);
		
		//save : List 사용
		bookList.add(x);
		System.out.println("!!! 도서 등록 완료 !!!");
	}
	
	//도서 목록 조회
	private void selectBookList() {
		System.out.println("------ 도서 목록 조회 ------");
		for(int i=0; i<bookList.size(); i++) {
					  //리스트의 사이즈만큼
			System.out.println(bookList.get(i));			
		}
		System.out.println("!!! 도서 목록 조회 완료 !!!");
	}
	
	//도서 상세 조회
	private void selectBookOne() {
		System.out.println("------ 도서 상세 조회 ------");
		System.out.println("상세 조회할 도서 번호 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.println(bookList.get(num));
		
		System.out.println("!!! 도서 상세 조회 완료 !!!");
	}
	
	//도서 수정
	private void updateBook() {
		System.out.println("------ 도서 수정 ------");
		
		System.out.println("수정할 도서 번호 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.println("도서 제목 : ");
		String title = sc.nextLine();
		System.out.println("도서 가격 : ");
		int price = Integer.parseInt(sc.nextLine());

		BookData x = bookList.get(num); 
		//제네릭을 적용해서 BookData만 가져오게 해놨으므로 
		//정적바인딩과 상관없이 BookData를 받아올 수 잇음
		x.setTitle(title);
		x.setPrice(price);

//		Object x = bookList.get(num);//get(num) - Object 타입으로 받아옴
//		BookData book = (BookData)x; Object 타입에는 setTitle 등이 없고 정적바인딩상태에서는 에러가 난다 
		//이를 타입캐스팅을 해줘서 (BookData)x 변환해준 것
//		//Object x -> BookData타입으로 변환 [타입캐스팅]
//		book.setTitle(title);
//		book.setPrice(price);
		
		System.out.println("!!! 도서 수정 완료 !!!");
	}
	
	//도서 삭제
	private void deleteBook() {
		System.out.println("------ 도서 삭제 ------");
		System.out.println("삭제할 도서 번호 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		bookList.remove(num);
		
		System.out.println("!!! 도서 삭제 완료 !!!");
	}
}
