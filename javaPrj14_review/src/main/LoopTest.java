package main;

public class LoopTest {

	public void test01(){
		
		System.out.println("====== While ======");
		
		int x = 1;
		while(x <= 10) {
			System.out.println(x);
			x++;
		}
		
	}
	
	public void test02() {
		
		System.out.println("====== for ======");
		
		//1~10
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}

		//10~20
		for(int i=10; i<=20; i++) {
			System.out.println(i);
		}
		
		//-5~+3
		for(int i=-5; i<=3; i++) {
			System.out.println(i);
		}
		//10~1
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
	}
		
}
