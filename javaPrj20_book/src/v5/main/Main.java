package v5.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		System.out.println("Book v5");
		
		Scanner sc = new Scanner(System.in);
		
		//Book info enroll
		Book[] x = new Book[3];
		for(int i=0; i < x.length; i++) {
			x[i] = new Book();
			System.out.println("도서 제목 : ");
			x[i].title = sc.nextLine();
			System.out.println("도서 저자 : ");
			x[i].author = sc.nextLine();
			System.out.println("도서 가격 : ");
			x[i].price = sc.nextInt();
			sc.nextLine();
		}
		
		//print Book List
		for(int i = 0; i < x.length; i++) {
			x[i].printInfo();			
		}
	}

}
