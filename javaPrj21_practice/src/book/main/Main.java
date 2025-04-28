package book.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("====== 도서관리 연습 ======");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정보를 입력할 도서의 개수");
		
		int n = sc.nextInt();
		sc.nextLine();
		
		Book[] x = new Book[n];
		
		for(int i = 0; i < n; i++) {
			x[i] = new Book();
			/*
			 * x[i] = new Book(); 
			 * Book 클래스의 새 인스턴스 생성
			 * x[] 에 아무 값도 할당하지 않으면 null 이므로 
			 * i 번째 요소에 새 객체를 할당하고 초기화
			 * 독립적이고 새로운 Book 객체
			 */
			System.out.print("도서 제목 : ");
			x[i].title = sc.nextLine();
			System.out.print("도서 저자 : ");
			x[i].author = sc.nextLine();
			System.out.print("도서 가격 : ");
			x[i].price = sc.nextInt();
			sc.nextLine();
		}
		
		for(int i=0; i < n; i++) {
			x[i].printInfo();			
		}
				
	}

}
