package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 배열 : 타입이 동일한 여러 변수를 동시에 관리
		 * 
		 * [문법]
		 * 선언 : 타입 [] 변수명;
		 * 할당 : 변수명 = new 타입[크기];
		 * 초기화 : 타입 [] 변수명 킬 빌 1부= new 타입[크기];
		 * 
		 * ex) 
		 * int [] x = new int[10];
		 * 
		 */
		
		System.out.println("===== Array =====");
		Scanner sc = new Scanner(System.in);
		//학생 3명 성적 입력받고, 순서대로 출력
		//성적은 0~100까지
		
		int[] a = new int[3];
		
		for(int i = 0; i<3; i++) {
			a[i] = sc.nextInt();
		} // for 문 다 돌면 끝나므로 int 선언 무효
		
		for(int i=0; i<3; i++) {
			System.out.println(a[i]);			
		}
		
		
		
		
		
//		System.out.print("학생 01 성적 : ");
//		int score01 = sc.nextInt();
//		System.out.print("학생 02 성적 : ");
//		int score02 = sc.nextInt();
//		System.out.print("학생 03 성적 : ");
//		int score03 = sc.nextInt();
//		System.out.print("학생 04 성적 : ");
//		int score04 = sc.nextInt();
//		System.out.print("학생 05 성적 : ");
//		int score05 = sc.nextInt();
//		System.out.print("학생 06 성적 : ");
//		int score06 = sc.nextInt();
//		System.out.print("학생 07 성적 : ");
//		int score07 = sc.nextInt();
//		System.out.print("학생 08 성적 : ");
//		int score08 = sc.nextInt();
//		System.out.print("학생 09 성적 : ");
//		int score09 = sc.nextInt();
//		System.out.print("학생 10 성적 : ");
//		int score10 = sc.nextInt();
//		
//		System.out.println(score01);
//		System.out.println(score02);
//		System.out.println(score03);
//		System.out.println(score04);
//		System.out.println(score05);
//		System.out.println(score06);
//		System.out.println(score07);
//		System.out.println(score08);
//		System.out.println(score09);
//		System.out.println(score10);
	}

}
