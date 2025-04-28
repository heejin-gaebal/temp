package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("====== CAFE ======");
		
		//메뉴판 보여주기
		//유저 입력 (메뉴, 수량)
		//결과 출력 (메뉴, 수량, 총 가격)
		
		int menu01Price = 1000;
		int menu02Price = 1500;
		int menu03Price = 2000;
		
		String menuName01 = "아메리카노";
		String menuName02 = "라떼";
		String menuName03 = "카푸치노";
				
		System.out.println("1. 아메리카노 ("+ menu01Price+"원)");
		System.out.println("2. 라떼 ("+ menu02Price+"원)");
		System.out.println("3. 카푸치노 ("+ menu03Price+"원)");
		
		//입력
		System.out.println("원하는 메뉴 번호를 입력하세요");
		Scanner sc = new Scanner(System.in);
	    
		int menuNum = sc.nextInt();

	    System.out.println("수량을 입력하세요");
	    int menuCnt = sc.nextInt();
	    
	    String menuName = "";
	    
	    int totalPrice = 0;
	    if(menuNum == 1) {
	    	menuName="아메리카노";
	    	totalPrice = menuCnt * menu01Price; 
	    }else if(menuNum == 2) {
	    	menuName="라떼";	    	
	    	totalPrice = menuCnt * menu02Price;
	    }else if(menuNum == 3) {
	    	menuName="카푸치노";	    	
	    	totalPrice = menuCnt * menu03Price;
	    }
	    
	    	    
	    //주문 내역 확인
	    System.out.println("선택하신 메뉴는 " + menuName +"(" + menuCnt + "잔)" + "입니다.");
	    System.out.println("총 가격은 " + totalPrice + "원 입니다");
	}
}
