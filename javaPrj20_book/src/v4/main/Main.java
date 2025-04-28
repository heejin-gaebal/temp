package v4.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("====== Book v4 ======");
		
		Scanner sc = new Scanner(System.in);
		
		//Book Enroll
		Book[] x = new Book[3];
//	   					  x 배열의 길이
		for(int i = 0; i < x.length; i++) {
			x[i] = new Book();	
			System.out.print("도서 제목 : ");
			x[i].title = sc.nextLine();
			System.out.print("도서 저자 : ");
			x[i].author = sc.nextLine();	
			System.out.print("도서 가격 : ");
			x[i].price = 5000;			
			sc.nextLine();
		}
		
		//Book List
		for(int i=0; i < x.length; i++) {
			System.out.println(x[i].title);
			System.out.println(x[i].author);
			System.out.println(x[i].price);
		}
	}

}
