package main;

public class Test01 {

	//메서드!!
	public void method01() {
		
		//자기소개
//		introduce("홍길동", 32, 183.5, 43.5, "아이스크림");

		//가위바위보
//		System.out.println("가위바위보 게임!!");
		
		//자기소개
//		introduce();
		
		//hello
//		hello();
		
		//printPlusOneAndTwo
//		printPlusOneAndTwo();
		
		//sayHi
//		sayHi("홍길동");
		
	}//method01
						// 전달받는 값 == 매개변수(파라미터/지역변수) stack 에 저장
	public void introduce(String name, int age, double height, double weight, String food) {
		System.out.println("안녕하세요 저는"+ name +"이에옹 ㅇㅂㅇ");
		System.out.println("저는 "+ age +"살이에용");
		System.out.println("제 키는 "+ height +"cm이고, 몸무게는" + weight + "입니다");
		System.out.println(food +" 먹고싶어용");
	}
		 //void : 비어있는
	public void hello() {
		System.out.println("hello~~!");
	}
// 접근제한자|리턴타입|-----메서드명-----|	
	public  void printPlusOneAndTwo() {
		//지역변수는 stack 에 저장
		int a = 1;
		int b = 2;
		System.out.println((a+b));
	}
		 			
	public void sayHi(String x) {
		System.out.println("반갑다!친구야");
		System.out.println("반갑다!" + x);
		System.out.println(x);
	}

		//리턴타입|바꿔줘야함 
	public int getNumber() { 
		return 777;
		//리턴하면 호출한 자리에 돌아감
	}
	
		 //리턴타입|바꿔줘야함 
	public String getName() { 
		return "박희진";
		//리턴하면 호출한 자리에 돌아감
	}
}
