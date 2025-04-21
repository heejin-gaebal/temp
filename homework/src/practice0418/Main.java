package practice0418;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		/*
		 * --- HJ 뮤지엄 티켓 안내입니다 ---
		 * 성인 1만원
		 * 청소년 5천원
		 * 시니어 3천원
		 * 유아,어린이 무료
		 * 국군장병 무료
		 */

		System.out.println("--- 2025 HJ뮤지엄 티켓 안내 ---");
		System.out.println(" ");

		System.out.println("일반 전시와 특별 전시 중 하나를 선택하세요 ");
		System.out.println("1.일반 전시 2.특별 전시");
				
		HjMuseo personType1 = new HjMuseo();
		HjMuseo personType2 = new HjMuseo();
		HjMuseo personType3 = new HjMuseo();
		HjMuseo personType4 = new HjMuseo();
		HjMuseo personType5 = new HjMuseo();
		
		personType1.age = ("성인");
		personType2.age = ("학생");
		personType3.age = ("시니어");
		personType4.age = ("유아,어린이");
		personType5.age = ("국군장병");

		personType1.price1 = 10000;
		personType2.price1 = 5000;
		personType3.price1 = 3000;
		personType4.price1 = 0;
		personType5.price1 = 0;

		personType1.price2 = 15000;
		personType2.price2 = 10000;
		personType3.price2 = 8000;
		personType4.price2 = 0;
		personType5.price2 = 0;
		
		while(true) {
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("일반 전시를 선택하셨습니다.");
				personType1.price1();		
				personType2.price1();		
				personType3.price1();		
				personType4.price1();		
				personType5.price1();	
				break;
			}else if(choice == 2) {
				System.out.println("특별 전시를 선택하셨습니다.");
				personType1.price2();		
				personType2.price2();		
				personType3.price2();		
				personType4.price2();		
				personType5.price2();
				break;
			}else {
				System.out.println("다시 선택하기");
				continue;
			}
		}
	}

}