package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("====== STUDENT ======");
		Scanner sc = new Scanner(System.in);
		
		Student x = new Student();
		

		System.out.print("이름 : ");
		x.name = sc.nextLine();
		System.out.print("HTML 성적 : ");
		x.html = sc.nextInt();
		System.out.print("CSS 성적 : ");
		x.css = sc.nextInt();
		System.out.print("JAVA 성적 : ");
		x.java = sc.nextInt();
		
		System.out.println(x.name);
		System.out.println(x.html);
		System.out.println(x.css);
		System.out.println(x.java);
	}

}
