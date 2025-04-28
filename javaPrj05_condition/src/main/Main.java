package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("=====조건문=====");
		
		/*
		 *	<<if, else, else if>>
		 *	
		 *	if문 : 조건에 따라 명령을 실행
		 *	
		 *	if(조건){명령}
		 *	- 조건이 true 일 때, 명령 실행
		 *
		 *	if(조건){명령1}
		 *	else{명령2}
		 *	- 조건이 false 일 때, else 명령이 실행
		 *
		 *	if(조건){명령1}
		 *	else if(조건){명령2}
		 *	else if(조건){명령3}
		 *	else if(조건){명령...}
		 *	else{명령...}
		 *	- if 조건이 true 이면 if 명령실행 (else if / else 무시),
		 *	  if 조건이 false 이면 else if 조건을 검사
		 *
		 *	switch 문 : 일치하는 case 를 찾아 실행
		 *	case 를 통과하면, 아래의 명령을 전부 실행하므로 필요에 따라 break 사용	
		 *
		 *	[문법]
		 *	switch(기준값){
		 *	case 비교값 : 명령;
		 *	case 비교값 : 명령;
		 *	case 비교값 : 명령;
		 *	...
		 *	default : 명령;
		 *	}
		 *
		 */
		
//		int age = 25;
//		
//		if(age >= 20) {
//			System.out.println("성인입니다.");
//		}
//		if(age < 20) {
//			System.out.println("학생입니다.");
//		}
		
		//정수형 변수 x 만들고, 값 100 할당
		//x 값이 양수인지 음수인지, 0인지 출력
		
		int x = 0;
		
		if (x > 0) {
			System.out.println("plus");
		}else if(x < 0) {
			System.out.println("minus");
		}else {
			System.out.println("zero");
		}
		
	}

}
