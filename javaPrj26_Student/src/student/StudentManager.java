package student;

import java.util.Scanner;

public class StudentManager {

	//배열변수 만들어주기
	private StudentData[] studentArr = new StudentData[10];
	private Scanner sc = new Scanner(System.in); //계속사용할 요소로 멤버변수로 이동
	private int cnt = 0;
	
	//멤버 메소드
	public void work() {
		
		while(true) {
			//메뉴 기능 선택
			int num = SelectNumber(); 
			//들어오는 리턴 값 타입에 맞춰 변수 타입을 맞춰준다.
			
			processFunction(num); 
			//리턴값을 받아야하므로 파라미터 num 추가함
		}
	}
	
	private int SelectNumber() {
		//메뉴 기능 선택
		System.out.println("------- Select Number -------");
		System.out.println("1. Insert");
		System.out.println("2. Print Student List");
		System.out.println("3. Print Student");
		System.out.println("4. Delete Student");
		System.out.println("5. Update Student");
		
		//메뉴번호 입력받기
		int num = sc.nextInt();
		sc.nextLine();
		
		return num; //입력받은 값을 다음 로직에서 사용해야하므로 리턴값 정해줌. 
	}//SelectNumber end
	
	private void processFunction(int num) { //num 값을 받아야하므로 파라미터 추가함
		switch(num) {
		case 1 :
			//학생 데이터 입력
			insert();
			break;
		case 2 :
			//학생 데이터 목록출력
			list();
			break;
		case 3 :
			//학생 데이터 상세조회
			printStudent();
			break;
		case 4 :
			//학생 데이터 삭제
			deleteStudent();
			break;
		case 5 :
			//학생 데이터 수정
			System.out.println("------- Update Student -------");
			break;
		default : 
			System.out.println("잘못 선택하셨습니다.");
		}
	}//processFunction end
	
	public void insert() {
		System.out.println("------- Insert -------");
		
		//데이터 입력받기 
		System.out.println("name : ");
		String name = sc.nextLine();
		System.out.println("score : ");
		int score = sc.nextInt();
		sc.nextLine();
		
		//데이터 -> 객체 변환
		StudentData data = new StudentData();
		data.name = name;
		data.score = score;
		
		//데이터 저장 [객체는 배열에 저장]
		studentArr[cnt] = data;
		cnt++;
		
		System.out.println("Insert Finish");
		
	}//insert end
	
	public void list() {
		System.out.println("------- Print Student List -------");
		
		for(int i=0; i < cnt; i++) {
			studentArr[i].printInfo();
		}
		
		System.out.println("Print Student List Finish");
		
	}//list end
	
	public void printStudent() {
		System.out.println("------- Print Student -------");

		//학생 목록 번호와 함게 보여주기
		for(int i=0; i < cnt; i++) {
			System.out.println(i +"번 학생 " + studentArr[i].name);
		}
		
		//원하는 학생 번호 입력받기
		System.out.println("상세조회할 학생 번호 : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		studentArr[number].printInfo();
	
		System.out.println("------- Print Student Finish-------");
		
		
	}//printStudent end
	
	public void deleteStudent(){
		System.out.println("------- Delete Student -------");

		//학생 목록 번호와 함게 보여주기
		for(int i=0; i < cnt; i++) {
			System.out.println(i +"번 학생 " + studentArr[i].name);
		}
		
		System.out.print("삭제할 번호를 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		//삭제
		studentArr[num] = null;
		
		System.out.println("------- Delete Student Finish-------");
		
	}//deleteStudent end
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
