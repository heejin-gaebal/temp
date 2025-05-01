package main;

public class Main {

	public static void main(String[] args) {

		System.out.println("====== Exception ======");
		
		Test test = new Test();
		test.m01();
		test.m02();

		System.out.println("=======================================");
		
		Test02 test02 = new Test02();
		test02.m01(); //try ~ catch : 예외 직접 처리
		
		System.out.println("=======================================");

		Test03 test03 = new Test03();
		test03.m01(); //이전 메소드에게 해당 예외를 던짐
	}

}
