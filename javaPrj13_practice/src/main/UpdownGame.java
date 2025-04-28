package main;

import java.util.Scanner;

public class UpdownGame {

	public static void main(String[] args) {
		
		System.out.println("===== UpdownGame =====");
		
		Scanner sc = new Scanner(System.in);
		
		// 1~100까지 그중 정답을 지정 | 정수 입력받고 | 그보다 높으면 다운 | 낮으면 업 | 맞추면 축하안내문
		System.out.println("Updown 게임입니다. 1~100 중 숫자 하나 골라주세요");
		
		int randomX = (int)(Math.random() * 100 + 1);
		
		while(true) {
			//정답 : 컴퓨터 랜덤값 설정
			
			//입력받음
			int user = sc.nextInt();
			
			if(user > randomX) {
				System.out.println("Down");			
			}else if(user < randomX) {
				System.out.println("Up");			
			}else {
				System.out.println("Great!!");			
			}
			
			if(user==0) {
				break;
			}
		}
		
	}

}
