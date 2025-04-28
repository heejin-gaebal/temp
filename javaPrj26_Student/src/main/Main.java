package main;

import student.StudentManager;

public class Main {

	public static void main(String[] args) {
		System.out.println("======= Student =======");
		
//		new StudentManager().work();	//매니저 객체생성하고 호출
		StudentManager studentManager = new StudentManager();
		studentManager.work();
		
	}

	
	/*
	 * 
	 */
}


