package v2.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("====== 도서 관리 프로그램 v2 ======");
		
		Scanner sc = new Scanner(System.in);
		
		Book b1 = new Book();
		System.out.print("도서 제목 : ");
		b1.title = sc.nextLine();
		System.out.print("도서 저자 : ");
		b1.title = sc.nextLine();
		System.out.print("도서 가격 : ");
		b1.title = sc.nextLine();
		
		Book b2 = new Book();
		System.out.print("도서 제목 : ");
		b2.title = sc.nextLine();
		System.out.print("도서 저자 : ");
		b2.title = sc.nextLine();
		System.out.print("도서 가격 : ");
		b2.title = sc.nextLine();
		
		Book b3 = new Book();
		System.out.print("도서 제목 : ");
		b3.title = sc.nextLine();
		System.out.print("도서 저자 : ");
		b3.title = sc.nextLine();
		System.out.print("도서 가격 : ");
		b3.title = sc.nextLine();
	}

}
