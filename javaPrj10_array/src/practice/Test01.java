package practice;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("배열 연습");
		
		//정수 3개를 한번에 관리할 수 있는 3칸짜리 정수형 배열 만들기
		//배열의 각 공간에 10,20,30 넣기
		//넣은 값 3개 출력
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
//		for(int i = 0; i<arr.length; i++) {
//			arr[i] = sc.nextInt();
//			
//			System.out.println(arr[i]);
//			배열을 출력하는 것이므로 배열을 넣어줌
//		}
	}

}
