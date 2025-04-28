package v6.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("====== Book v6 ======");
		
		Scanner sc = new Scanner(System.in);

		//manage Book * n
		//enroll Book Info
		System.out.println("정보를 입력할 도서 권 수 : ");
		
		int n = sc.nextInt();
		sc.nextLine();
		
		Book[] x = new Book[n];
		for (int i = 0; i < n; i++) {
			x[i] = new Book();
			System.out.print("title : ");
			x[i].title = sc.nextLine();
			System.out.print("author : ");
			x[i].author = sc.nextLine();
			System.out.print("price : ");
			x[i].price = sc.nextInt();
			sc.nextLine();
		}
		
		//print Book List
		for(int i = 0; i < x.length; i++) {
			x[i].printInfo(); 
		}
	}

}
