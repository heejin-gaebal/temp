package com.kh.main;

import com.kh.book.BookManager;

public class Main {

	public static void main(String[] args) {

		System.out.println("====== Book ======");
		
		BookManager bookManager = new BookManager();
		bookManager.menu();
	}

}
