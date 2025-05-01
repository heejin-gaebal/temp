package com.kh.book;

import java.util.Scanner;

public class BookManager {

	private Scanner sc = new Scanner(System.in);
	private BookData[] bookDataArr = new BookData[100];
	private int cnt = 0;

	//menu
	public void menu() {
		while(true) {
			printMenu();
			int menuNum = scanMenuNum();
			if(menuNum == 0) {
				System.out.println("--- Program Exit ---");
				break;
			}
			callFunction(menuNum);
		}
	}
	
	public void printMenu() {
		System.out.println("------ MENU ------");
		System.out.println("0. Exit");
		System.out.println("1. insert");
		System.out.println("2. selectList");
		System.out.println("3. selectOne");
		System.out.println("4. update");
		System.out.println("5. delete");
	}
	
	public int scanMenuNum() {
		System.out.println("Menu Number : ");
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}
	
	public void callFunction(int menuNum) {
		switch(menuNum) {
		case 1 : insert(); break;
		case 2 : selectList(); break;
		case 3 : selectOne(); break;
		case 4 : update(); break;
		case 5 : delete(); break;
		default : System.out.println("Wrong Number");
		}
	}
	
	//insert
	public void insert() {
		System.out.println("==== Book insert ====");
		System.out.print("title : ");
		String title = sc.nextLine();
		System.out.print("author : ");
		String author = sc.nextLine();
		System.out.print("price : ");
		int price = Integer.parseInt(sc.nextLine());
		
		//validate 유효성검사
		if(title.length() < 1) {
			System.out.println("도서 등록 중 문제 발생..");
			return;
		}
		if(author.length()<1) {
			System.out.println("도서 등록 중 문제 발생..");
			return;
		}
		if(price < 0) {
			System.out.println("도서 등록 중 문제 발생..");
			return;
		}
		
		//data -> object
		BookData bookData = new BookData();
		bookData.setTitle(title);
		bookData.setAuthor(author);
		bookData.setPrice(price);
		
		//save
		bookDataArr[cnt] = bookData;
		cnt++;
		
		System.out.println("------ Insert Finish ------");
	}
	
	//select list
	public void selectList() {
		System.out.println("==== Select List ====");
		
		for(int i=0; i<cnt; i++) {
			System.out.println(i + "번 : " + bookDataArr[i].getTitle());
		}
	}
	
	//select one
	public int selectOne() {
		System.out.println("==== Select One ====");
		System.out.print("book numner : ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println(bookDataArr[num]);
		
		return num;
	}
	
	//update
	public void update() {
		System.out.println("==== Update ====");
		
//		System.out.println("book num : ");
//		int num = Integer.parseInt(sc.nextLine());
//		System.out.println(bookDataArr[num]);
		int num = selectOne();
		
		System.out.println("title : ");
		String title = sc.nextLine();
		System.out.println("author : ");
		String author = sc.nextLine();
		System.out.println("price : ");
		int price = Integer.parseInt(sc.nextLine());
		
		bookDataArr[num].setTitle(title);
		bookDataArr[num].setAuthor(author);
		bookDataArr[num].setPrice(price);
	}
	
	//delete
	public void delete() {
		System.out.println("==== Delete ====");
		System.out.println("book num : ");
		int num = Integer.parseInt(sc.nextLine());
		for(int i = num; i<cnt-1; i++) {
			bookDataArr[i] = bookDataArr[i+1]; 
		}
		bookDataArr[cnt-1]=null;
		cnt--;
	}
}
