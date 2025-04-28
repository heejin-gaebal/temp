package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("===== McDonald =====");
		
		//스캐너 만들기
		Scanner sc = new Scanner(System.in);
		
		//메뉴이름 변수
		String menu01 = "상하이스파이스버거";
		String menu02 = "빅맥";
		String menu03 = "치즈버거";
		
		int menu01Price = 5000;
		int menu02Price = 6000;
		int menu03Price = 7000;
		
		//메뉴판
		System.out.println("===== MENU =====");
		System.out.println("1. "+ menu01 + "("+ menu01Price +"원)");
		System.out.println("2. "+ menu02 + "("+ menu02Price +"원)");
		System.out.println("3. "+ menu03 + "("+ menu03Price +"원)");
		
		//유저 입력받기 (메뉴)
		System.out.print("원하는 메뉴 입력하세요 : ");
		int menuNum = sc.nextInt();
		
		System.out.print("원하는 수량을 입력하세요 : ");
		int cntPrice = sc.nextInt();
		int totalPrice = 0;
		
		if(menuNum == 1) {
			totalPrice = cntPrice * 5000; 
		}else if(menuNum == 2) {
			totalPrice = cntPrice * 6000; 
		}else if(menuNum == 3) {
			totalPrice = cntPrice * 7000; 
		}
		
		//유저 입력에 따른 값 설정
		String menuName = "";
		switch(menuNum) {
		case 1 : 
			menuName = menu01; 
			break;
		case 2 : 
			menuName = menu02; 
			break;
		case 3 : 
			menuName = menu03; 
			break;
		}
		
		//결과 출력 (주문내역 확인)
		System.out.println("===== 주문 내역 =====");
		System.out.println(menuName +" 주문하셨습니다.");
		System.out.println("총 금액은 " + totalPrice + "원입니다.");
	}

}
