package main;

import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) {
		System.out.println("===== 학생 성적관리 프로그램 02 =====");
		
		Scanner sc = new Scanner(System.in);

		//학생 N명 성적관리 프로그램
		//학생 수 입력하라는 안내문 출력
		System.out.println("학생 수를 입력해주세요");
		System.out.print("학생 수 입력 : ");

		//학생 수 입력받기
		int stCnt = sc.nextInt();	
		sc.nextLine(); //엔터 출력

		//학생 이름과 성적 저장하는 배열
		String[] stuName = new String[stCnt];
		int[] stuScore = new int[stCnt];
				
		//입력받은 수만큼 이름 성적 넣기
		for(int i=0; i<stCnt; i++) {
			stuName[i] = sc.nextLine();
			stuScore[i] = sc.nextInt();
			sc.nextLine(); //엔터 출력
		}
		
		for(int i=0; i<stCnt; i++) {
			System.out.println(stuName[i] + "의 성적" + stuScore[i] + "점");
		}
	}
}
