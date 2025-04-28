package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("=====UPDOWN_v2=====");
		
		//문자열 타입 | 유저이름 입력받기
		System.out.println("유저 이름 : ");
		//String userName ="박희진";
		Scanner sc = new Scanner(System.in);
		//문자열 입력 - 한줄 통째로 읽음
	    String userName = sc.nextLine();
		
		//정답 설정
		//컴퓨터가 랜덤값 설정 | Math.random()은 0~1사이의 값이 default
		int answer = (int)(Math.random() * 50 + 1); //소수자리인 random 함수에 원하는 숫자범위를 곱한다
				//여기서 int는 연산자, 우선순위높음
		int cnt = 0;
		
		while(true) {
			System.out.println("1~50 사이의 숫자 : ");
		    int userInput = sc.nextInt();
		    
		    if(userInput > 50 || userInput <1) {
		    	//잘못된 입력값
		    	System.out.println("잘못 입력하셨습니다.");
		    	continue;
		    }
		    
		    cnt++; // 잘못 입력된 값 카운트 하지않기위해 그 밑에 작성
		    
			//결과 출력
		    if(answer > userInput) {
		    	System.out.println("UP");	    	
		    }else if(answer < userInput) {
		    	System.out.println("DOWN");	    	
		    }else {
		    	System.out.println("GOOD!!!");
		    	System.out.println(userName + "승!!");
		    	System.out.println("시도횟수 : " + cnt); 
		    	//타입이 다르면 형변환 필요 - 데이터 손실 나지 않으면 자동변환
		    	break;
		    }
		}

		/*
		 * 형변환 / 타입변환
		 * int 타입을 long 타입으로 바꾸기
		 * 앞에 타입을 써주면 됨
		 * 큰 타입에서 작은 타입으로 바꿀때 데이터 손실 발생 가능
		 */
		 		
		
	}

}
