package main;

import book.BookController;

public class Main {

	public static void main(String[] args) {
		System.out.println("====== Book ======");
		
		BookController bookController = new BookController();
		bookController.menu();
	}

}
