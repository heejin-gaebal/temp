package main;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		System.out.println("===== 학생 성적관리 프로그램 =====");

		//학생 5명 관리 [배열] 
		//이름, 성적 기록하는 프로그램
		String[] studentNames = new String[5];
		
		int[] studentScores = new int[5];
		//int 타입 배열의 주소값 = 주소값만 들어간다
		//배열의 첫번째 칸 주소는 대표주소
		
		//스캐너 만들기
		Scanner sc = new Scanner(System.in);
		
		//이름과 성적 입력받기 - 5명 반복문 구현
		for(int i=0; i<5; i++) {
			System.out.print("학생 이름 : ");
			studentNames[i] = sc.nextLine();
			
			System.out.print("학생 성적 : ");
			studentScores[i] = sc.nextInt();
			sc.nextLine(); //엔터 출력
		}
		
		//출력하기
		for(int i=0; i<5; i++) {
			System.out.println(studentNames[i] + "의 성적 : " + studentScores[i]);
		}
	}
}
