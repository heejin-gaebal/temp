package student.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// field == member variable
		// 필드 == 멤버변수 == 객체변수 == 인스턴스(instance) 변수
		// 객체 == 인스턴스 == 오브젝트(Object)
		
		System.out.println("====== 학생 n명에 대해 이름,성적 관리 ======");

		Scanner sc = new Scanner(System.in);
		
		//학생 정보 등록 
		System.out.println("관리할 학생 수를 적어주세요");
		
		int n = sc.nextInt();
		sc.nextLine();
		
		Student[] s = new Student[n];
		
		for(int i=0; i<n; i++) {
			s[i] = new Student();
			System.out.print("학생 이름 : ");
			s[i].name = sc.nextLine();
			System.out.print("학생 성적 : ");
			s[i].score = sc.nextInt();
			sc.nextLine();
		}
		
		//학생 정보 출력
		for(int i=0; i<n; i++) {
			s[i].studentInfo();
		}

	}

}
