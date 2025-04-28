package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//스캐너 만들기
		Scanner sc = new Scanner(System.in);
		
		//학생 성적 관리(이름,성적)
		
		//데이터 입력받기
		System.out.print("학생 이름  : ");
		String name = sc.nextLine();
		System.out.print("학생 성적  : ");
		int score = sc.nextInt();
		sc.nextLine();
		
		//데이터를 객체로 관리하기
		Student s = new Student();	//객체생성 == 생성자 호출
		//객체의 필드에 값 넣기
		s.name = name;
		s.score = score;

		//데이터 출력하기
		//객체의 메서드가 실행
		s.printInfo();
		
	}

}
