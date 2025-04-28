package main;

import java.util.Scanner;

public class BookManager {
   
   private Scanner sc = new Scanner(System.in);
   private BookData[] bookDataArr = new BookData[100];
   private int cnt = 0;
   
   //메뉴 (기능 선택)
   public void selectMenu() {
      while(true) {
         printMenu();
         int input = scanInput();
         if(input == 0) {
            System.out.println("EXIT !!!");
            break;
         }
         processFunction(input);
      }
   }
   
   public void printMenu() {
      System.out.println("\n\n\n\n\n");
      System.out.println("----- MENU -----");
      System.out.println("0. EXIT");
      System.out.println("1. INSERT BOOK");
      System.out.println("2. PRINT BOOK LIST");
      System.out.println("3. PRINT BOOK DETAIL");
      System.out.println("4. UPDATE BOOK");
      System.out.println("5. DELETE BOOK");
   }
   public int scanInput() {
      System.out.print("input menu number : ");
      int input = sc.nextInt();
      sc.nextLine();
      return input;
   }
   public void processFunction(int x) {
      switch(x) {
      case 1 : insertBook(); ; break;
      case 2 : printBookList(); ; break;
      case 3 : printBookDetail(); ; break;
      case 4 : updateBook(); ; break;
      case 5 : deleteBook(); ; break;
      default : System.out.println("잘못 누르셨습니다.");
      }
   }
   
   //도서 등록
   public void insertBook() {
      //input data
      System.out.println("\n\n-----INSERT BOOK -----");
      System.out.print("title : ");
      String title = sc.nextLine();
      System.out.print("author : ");
      String author = sc.nextLine();
      System.out.print("price : ");
      int price = sc.nextInt();
      sc.nextLine();
      
      //data -> object
      BookData bookData = new BookData(title, author, price);
      
      //save object
      bookDataArr[cnt] = bookData;
      cnt++;
      
   }
   
   //도서 목록조회
   public void printBookList() {
      for(int i = 0; i < cnt; ++i) {
         if(bookDataArr[i] == null) {
            continue;
         }
         System.out.println( i + " 번 도서 : " + bookDataArr[i] );
      }
   }
   
   //도서 상세조회
   public void printBookDetail() {
      System.out.println("\n----- PRINT BOOK DETAIL -----");
      System.out.println("BOOK NUMBER : ");
      int n = sc.nextInt();
      sc.nextLine();
      System.out.println(bookDataArr[n]);
   }
   
   //도서 수정
   public void updateBook() {
		System.out.print("\n ----- Update Book");
		System.out.print("Book Number : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.print("title : ");
		String title = sc.nextLine();
		System.out.print("author : ");
		String author = sc.nextLine();
		System.out.print("price : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		BookData x = bookDataArr[n];
		x.setTitle(title);
		x.setAuthor(author);
		x.setPrice(price);
		System.out.println(4);
	}
	
	//도서 삭제
	public void deleteBook() {
		System.out.print("\n ----- Delete Book");
		System.out.print("Book Number : ");
		int n = sc.nextInt();
		sc.nextLine();
		bookDataArr[n] = null;
	}

}//class
