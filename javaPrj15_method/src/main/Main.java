package main;

public class Main {

	public static void main(String[] args) {

		Test01 x = new Test01();
		//생성자호출 Test01객체 생성 | Test01 이라는 타입의 x 라는 변수에 담는다
		
		x.method01();
		//method01라는 메서드를 실행한다
		
//		x.introduce("둘리", 325, 103.5, 80.5, "삼겹살");
		//인자값(argument)이 지정된 메서드라면 메서드에 맞는 타입의 값을 넣어준다.
		
//		int num = x.getNumber();
//		System.out.println(num);
//		
//		String name = x.getName();
//		System.out.println(name);
		
		Test02 y = new Test02();
		y.method02();
//		y.printPlusOne(20);
		
//		String color = y.getColor();
//		System.out.println(color);
		
		int result = y.plus(10, 20);
		System.out.println(result);
	}
}
