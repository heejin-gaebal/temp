package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("===== Loop =====");

		/*
		 * <<반복문>>
		 * 반복 작업을 위해 사용 
		 * while , for , do-while
		 * break : 현재 블럭 탈출할 때 사용 
		 * continue : 반복문 처음으로 복귀
		 * 
		 * [while 문법 - 무한반복]
		 * while(조건){명령}
		 * - 작업이 끝나고 다시 처음으로 복귀 (조건 검사 | 조건이 false 될 때까지)
		 * 
		 * [for 문법 - 일정반복]
		 * for(초기식; 조건식; 증감식){명령}
		 * 
		 * do{명령}while(조건식); - 세미콜론 필수
		 * 
		 */
		
		int cnt = 0;
		
		while(true) {
			System.out.println("Hello~ World!"); // 한번 출력된 상태 (1)
			cnt++; // cnt = 1
			if(cnt/*cnt = (1)*/==3) {
				break;
			}
		}
	}

}
