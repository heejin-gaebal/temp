package practice;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== practice main =====");
		
//		Test01 x = new Test01();
//		x.hello();
		
//		Test02 x = new Test02();
//		x.hi();

//		Test03 x = new Test03();
//		x.introduce();
		
		Test04 a = new Test04();
		a.printPlusOne(10);
		
		Test05 b = new Test05();
		b.printMinusOne(10);
		
		Test06 c = new Test06();
		c.printName("홍길동");
		
		Test07 d = new Test07();
		d.printNameAndAge("홍길동", 20);
		
		Test08 e = new Test08();
		e.printHeightAndWeight(162.4, 85.8);
		
	}

}
