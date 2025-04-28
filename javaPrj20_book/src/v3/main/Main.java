package v3.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("======= 도서 관리 프로그램 v3 =======");
		
		Scanner sc = new Scanner(System.in);
		
		//도서 정보 입력 객체 배열사용하기
		Book[] x = new Book[3];
		x[0] = new Book(); //배열 변수에 객체
		x[1] = new Book(); 
		x[2] = new Book();
		
		System.out.print("도서제목 : ");
		x[0].title=sc.nextLine();
		System.out.print("도서저자 : ");
		x[0].author=sc.nextLine();
		System.out.print("도서가격 : ");
		x[0].price=sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서제목 : ");
		x[1].title=sc.nextLine();
		System.out.print("도서저자 : ");
		x[1].author=sc.nextLine();
		System.out.print("도서가격 : ");
		x[1].price=sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서제목 : ");
		x[2].title=sc.nextLine();
		System.out.print("도서저자 : ");
		x[2].author=sc.nextLine();
		System.out.print("도서가격 : ");
		x[2].price=sc.nextInt();
		sc.nextLine();
		
		//도서 목록 출력
		System.out.println(x[0].title);
		System.out.println(x[0].author);
		System.out.println(x[0].price);
		
		System.out.println(x[1].title);
		System.out.println(x[1].author);
		System.out.println(x[1].price);
		
		System.out.println(x[2].title);
		System.out.println(x[2].author);
		System.out.println(x[2].price);
	}

}
