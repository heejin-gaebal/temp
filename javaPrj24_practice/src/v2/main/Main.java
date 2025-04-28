package v2.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("====== Student v2 ======");
		Scanner sc = new Scanner(System.in);
		
		//학생 10명 관리
		Student[] studentArr = new Student[10];
		int studentCnt = 0;
		
		while(true) {
			//기능 메뉴판
			System.out.println("0. 종료하기");
			System.out.println("1. 학생정보 등록");
			System.out.println("2. 학생정보 목록 출력");
			System.out.println("3. 학생정보 상세조회");
			
			//유저 입력
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			if(menuNum == 1) {
				//기능 : 학생정보 등록 - 이름, 나이 입력받아 객체에 저장
				studentArr[studentCnt] = new Student();
				System.out.print("name : ");
				studentArr[studentCnt].name = sc.nextLine();
				System.out.print("score : ");
				studentArr[studentCnt].score = sc.nextInt();
				sc.nextLine();
				studentCnt++;
			}else if(menuNum == 2){
				//기능 : 학생정보 목록 출력
				for(int i=0;i < studentCnt; i++) { //배열의 길이전체가 아닌목록에 들어간 값만 출력
					System.out.print(i +"번 학생 : ");	// 학생 넘버링
					studentArr[i].printInfo();
				}
			}else if(menuNum == 0) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}else if(menuNum == 3) {
				System.out.println("상세조회 할 학생의 번호 : ");
				int n = sc.nextInt(); 		//상세조회할 n 번 학생 입력받기
				sc.nextLine();				//n 번 학생 입력받기
				studentArr[n].printInfo();	 
				System.out.println("상세조회 결과입니다.");
			}
		}
	}
}
