package main;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		// 정수 a, b 입력 받고 
		// a 부터 b 까지 출력, a < b
		
		Scanner sc = new Scanner(System.in);
	      		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while(a <= b) { //기존 if 문의 반대 조건
			System.out.println(a);
			a++;
		}
	}

}