package animal;

import java.util.Scanner;

public class AnimalManager {
	private Scanner sc = new Scanner(System.in);
	private AnimalData[] animalArr = new AnimalData[5];
	private int cnt = 0;

	public void work() {
		
		
		// 동물 정보 등록
		// 동물 목록 조회
		// 동물 상세 조회
		// 동물 삭제
		
		menuList();
		
		int num = scanNumber();
		
		if(num == 0) {
			System.out.println("프로그램 종료");
			return;
		}
		menuProcess(num);
	}
	
	public void menuList() {
		System.out.println("메뉴를 선택해주세요");
		System.out.println("1. 동물 정보 등록");
		System.out.println("2. 동물 목록 조회");
		System.out.println("3. 동물 상세 조회");
		System.out.println("4. 동물 삭제");
	}
	
	public int scanNumber() {
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();

		return num;
	}
	
	public void menuProcess(int num) {
		//메뉴고르기
		switch(num) {
		case 1 :
			insert();
			break;
		case 2 :
			printList();
			break;
		case 3 :
			break;
		case 4 :
			break;
		default: System.out.println("다시 선택하기");
		}
	}
	
	public void insert() {
		System.out.println("동물 정보를 등록하세요");
		
		System.out.println("동물 이름 : ");
		String name = sc.nextLine();
		System.out.println("동물 나이 : ");
		int age = sc.nextInt();
		System.out.println("동물 몸무게 : ");
		double weight = sc.nextDouble();
		
		AnimalData animalData = new AnimalData();
		animalData.name = name;
		animalData.age = age;
		animalData.weight = weight;
		
		//객체로 변환한것을 배열에 저장
		animalArr[cnt] = animalData;
		cnt++;
		
		System.out.println("동물 정보 -등록완료-");
	}
	
	public void printList() {
		System.out.println("동물 목록 조회하기");
		
		for(int i=0; i<cnt; i++) {
			animalArr[cnt].animalInfo();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
