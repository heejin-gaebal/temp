package main;

import java.util.Scanner;

public class StudentManage {

	public static void main(String[] args) {
		
		System.out.println("===== MANAGE STUDENT =====");

		System.out.println("성적을 넣을 학생 수를 입력해주세요");
		
		Scanner sc = new Scanner(System.in);
		int studentCnt = sc.nextInt();
		// 학생 studentCnt명 입력받아서 이름과 성적을 넣어주는 배열 만들기
		//studentCnt명의 배열
		
		String[] stName = new String[studentCnt];
		int[] stScore = new int[studentCnt];
		sc.nextLine(); //엔터 출력
		
		//이름과 성적 입력넣기 근데 이제 반복문을 곁들인.
		for(int i=0; i<studentCnt; i++) {
			System.out.println("학생의 이름 : ");
			stName[i] = sc.nextLine();
			
			System.out.println("학생의 성적 : ");
			stScore[i] = sc.nextInt();
			sc.nextLine(); //엔터 출력

		}
		
		for(int i=0; i<studentCnt; i++) {
			System.out.println(stName[i] + "의 성적은 : " + stScore[i] + "입니다.");			
		}
		
	}

}
