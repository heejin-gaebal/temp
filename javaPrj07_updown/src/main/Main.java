package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// <<업다운 게임>>
		
		// 정답 지정
		// 유저 입력
		// 결과 출력 (업/다운/정답)
		// + 정답일때, 시도횟수 출
		
		System.out.println("===== UpDown 게임 ====="); // println 줄바꿈 하기
		Scanner sc = new Scanner(System.in);
		
		//정답 지정
		int answer = 25;
		
		//카운트 선언
		int cnt = 0;
		
		while(true) {
			//유저 입력
			System.out.print("1~50사이의 숫자를 입력하세요 : "); // print 한줄로 나오기
		    int userInput = sc.nextInt();
		    cnt++;
		    
			// 결과 출력 (업/다운/정답)
		    if(userInput < answer) {
		    	System.out.println("UP");	    	
		    }else if(userInput > answer) {
		    	System.out.println("DOWN");	    	
		    }else {
		    	System.out.println("GOOD!!");
		    	System.out.println(cnt + "번만에 시도!!");
		    	break;
		    }
		}
	}
}