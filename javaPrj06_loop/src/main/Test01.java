package main;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		// 한 자리 수 입력, 그 수 부터 100까지 출력
		// 입력받은 정수 계속 출력
		
		Scanner sc = new Scanner(System.in);
	      		
		int x = sc.nextInt();
		
		while(true) {	//기존 if 문의 반대 조건
			System.out.println(x);
			x++;
			if(x > 100) {
				break;
			}
		}
	}

}
