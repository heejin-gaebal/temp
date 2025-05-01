package main;

public class Main {

	public static void main(String[] args) {

		System.out.println("variable!!!");
		
		/*
		 *	<<변수>>
		 * 
		 *  변수 : 값을 담는 공간
		 * 
		 *  [문법]
		 *  타입 변수명 = 값;
		 *  int   x  = 10;
		 * 
		 *  syso = System.out.println(); 자동완성
		 * 
		 *  "" = 쌍따옴표 안은 문자열로 출력
		 *  변수 출력은 쌍따옴표없이 println(x);
		 * 
		 *--------------------------------------------------------------
		 * 
		 *  <<선언, 초기화, 할당>>
		 *  
		 *  선언 : 변수 만들께~
		 *  - 타입 변수명; 
		 *  - int x;
		 *  
		 *  할당 : 값 넣을께~
		 *  - 변수명  = 값;
		 *  - x = 10;
		 *  
		 *  초기화 : 선언 + 할당 		 
		 *  - int x = 10;  
		 *  
		 *  --------------------------------------------------------------
		 *  
		 *  <<변수 명명 규칙>>
		 *	의미있게
		 *	camelCase (PascalCase/snake_case/kebab-case)
		 *	특수문자 X( _ , $ 가능)
		 *	숫자로 시작 X
		 *	예약어 X
		 *
		 *  <<변수 타입 == 자료형>>
		 *  기본형 (primitive)
		 *  - 정수 : byte(1바이트 = 8bit), short(2바이트), int(4바이트), long(8바이트)
		 *  - 실수 : float(4바이트), double(8바이트)
		 *  		실수의 기본 타입은 double로 저장되어 
		 *  		float에 저장하면 저장공간이 8->4로 적어지므로 데이터 손실우려.
		 *  		그래서 float형에 저장할 경우 값 뒤에 f를 넣어주면 float타입으로 저장
		 *  		
		 *  - 문자 : char(한 글자) : '' 따옴표 사용
		 *  - 문자열(여러글자) : "" 쌍따옴표 사용
		 *  - 논리 : boolean | true / false
		 *  
		 *  참조형 (reference)
		 *  
		 */
		
//		int x;
//		x = 10;
		byte x = (byte)130; //-126 
		//캐스팅(Casting)은 데이터 타입을 다른 데이터 타입으로 변환하는 과정.
		//오버플로우 - 값이 타입의 공간보다 넘으면 다시 맨처음값으로 돌아가서 카운트  
		
		System.out.println(x);
		
		
		
	}// main

}// class
