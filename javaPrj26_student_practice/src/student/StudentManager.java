package student;

import java.util.Scanner;

public class StudentManager {
	
	//배열변수 만들어주기
	private StudentData[] studentArr = new StudentData[10];
	private Scanner sc = new Scanner(System.in);
	
	private int cnt = 0;
	//메뉴 기능 선택
	
	public void work() {
		
		while(true) {
			int num = SelectNum();
			
			ProcessFunction(num);
		}
	}
	private int SelectNum() {
		System.out.println("메뉴번호를 입력하세요");
		System.out.println("1.학생 데이터 입력");
		System.out.println("2.학생 데이터 목록");
		System.out.println("3.학생 데이터 상세조회");
		System.out.println("4.학생 데이터 삭제");
		System.out.println("5.학생 데이터 수정");

		//메뉴 번호 입력받기
		int num = sc.nextInt();
		sc.nextLine();

		return num;
	}
	
	private void ProcessFunction(int num) {
		switch(num) {
		case 1 :
			// 학생 데이터 입력
			insert();
			break;
		case 2 :
			// 학생 데이터 목록출력
			list();
			break;
		case 3 :
			// 학생 데이터 상세조회
			printStudent();
			break;
		case 4 :
			// 학생 데이터 삭제
			deleteStudent();
			break;
		case 5 :
			// 학생 데이터 수정
			update();
			break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void insert() {
		System.out.println("------- 학생 데이터 입력 -------");
		
		//데이터 입력받기
		System.out.println("name : ");
		String name = sc.nextLine();
		System.out.println("score : ");
		int score = sc.nextInt();
		sc.nextLine();
	
		//객체 변환
		StudentData data = new StudentData();
		data.name = name;
		data.score= score;
		
		//객체 배열 저장
		studentArr[cnt] = data;
		cnt++;
		
		System.out.println("데이터 입력완료");
	}//insert end
	
	public void list() {
		System.out.println("------ 학생 데이터 목록 ------");
		
		for(int i=0; i<cnt; i++) {
			studentArr[i].printInfo();
		}
		
		System.out.println("학생 데이터 목록 끝");
	}//list end
	
	public void printStudent() {
		System.out.println("------ 학생 데이터 상세조회 ------");
		
		for(int i=0; i<cnt; i++) {
			System.out.println(i + "번 학생 " + studentArr[i].name);
		}
		
		//상세조회 할 학생번호 입력받기
		int num = sc.nextInt();
		studentArr[num].printInfo();
		
		System.out.println("학생 데이터 상세조회 끝");
	}//printStudent end
	
	public void deleteStudent() {
		System.out.println("------ 학생 데이터 삭제 ------");
		
		for(int i=0; i<cnt; i++) {
			System.out.println(i + "번 학생 " + studentArr[i].name);
		}
		
		//삭제할 학생 번호 입력받기
		int num = sc.nextInt();
		
		studentArr[num] = null; 
		
		System.out.println("학생 데이터 삭제 끝");
	}//deleteStudent end
	
	public void update() {
		System.out.println("------ 학생 데이터 수정 ------");
		
		//학생 목록 우선 보여주기
		for(int i=0; i<cnt; i++) {
			System.out.println(i + "번 학생 " + studentArr[i].name);
		}
		
		//수정필요한 학생 번호 입력받기
		int num = sc.nextInt();
		
		studentArr[num].score = 10;
		
		System.out.println("학생 데이터 수정 끝");
	}
}
