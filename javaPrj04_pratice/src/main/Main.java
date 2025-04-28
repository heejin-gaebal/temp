package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("=====연습!!!=====");
		
		//	정수형 변수 x를 만들고 숫자 10을 할당한 뒤 값 출력
		int x = 10;		
		System.out.println(x);
		
		//	정수형 변수 a, b 만들기
		//	a, b 각각의 변수에 10 , 3 대입하기 
		//	두 변수를 이용해 산술연산 후 결과를 출력
		
		//int a=10, b=3; 이렇게 한줄 선언할 수 있지만 권장하지않는 방법
		int a = 10;
		int b = 3;
		System.out.println(a * b);
		
		//	논리형 변수 isMale 만들기
		//	논리형 변수 isAdult 만들기
		//	각각의 변수에 true, false 값 할당
		//	두 변수의 논리연산 결과를 출력
		
		boolean isMale = false;
		boolean isAdult = true;
		
		System.out.println(isMale || isAdult);
		
	}

}
