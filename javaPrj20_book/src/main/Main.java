package main;

public class Main {

	public static void main(String[] args) {

		System.out.println("====== 도서 관리 프로그램 ======");
		
		//도서 정보 기록
		Book b1 = new Book();			//Book 타입 b1변수에, Book 객체 생성하여, 할당
		b1.title = "검은고양이";			//b1 객체 안에 있는 title 변수에 "검은 고양이" 할당
		b1.author = "애드가 앨런 포";		//b1 객체 안에 있는 author 변수에 "애드가 앨런 포" 할당
		b1.price = 12000;				//b1 객체 안에 있는 price 변수에 "12000" 할당
		
		Book b2 = new Book();			//b2변수에 Book 객체 할당
		b2.title = "원피스";
		b2.author = "오다에이치로";
		b2.price = 8000;
		
		Book b3 = new Book();
		b3.title = "무빙";
		b3.author = "강풀";
		b3.price = 10000;
		
		//도서 목록 확인
		System.out.println(b1.title);
		System.out.println(b1.author);
		System.out.println(b1.price);
		
		System.out.println(b2.title);
		System.out.println(b2.author);
		System.out.println(b2.price);
		
		System.out.println(b3.title);
		System.out.println(b3.author);
		System.out.println(b3.price);
	}

}
