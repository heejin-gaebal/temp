package com.kh.main;

public class Test {

	public void method01() {
		
		String str = "zzz";
		System.out.println(str);
		
	}
	
	public void method02() {
		String s = "abc";
		System.out.println(s.toString());
	}

	public void method03() {
		String s = "zzz";
		System.out.println(s.length());
	}
	
	public void method04() {
		String s = "abcdefgh";
		int i = s.indexOf('e');
		System.out.println(i);
	}
	/*
	 * 해당 클래스 배열로 나뉘어져서 하나씩 해당 
	 * "abcdefgh" 8칸짜리 배열 0~n
	 * 
	 * return 이랑 result 차이?
	 * 
	 */

	public void method05() {
		String s = "abcdefgh";
		char result = s.charAt(3);
		System.out.println(result);
	}

	public void method06() {
		String s1 = "hello";
		String s2 = "world";
		boolean result = s1.equals(s2); //equals 는 문자열을 비교 | boolean 타입
		System.out.println(result);
	}

	public void method07() {
		String str = "java html css";
		String result1 = str.substring(2);
		String result2 = str.substring(2, 7);
		String result3 = str.toUpperCase();
		String[] result4 = str.split(" ");
		System.out.println(result1); 	//<va html css>
		System.out.println(result2); 	//<va ht>
		System.out.println(result3); 	//<JAVA HTML CSS>
		System.out.println(result4[0]); //<java>
		System.out.println(result4[1]); //<html>
		//공백도 체크 | 배열에 공백이라는 값이 들어가있음
	}
}
