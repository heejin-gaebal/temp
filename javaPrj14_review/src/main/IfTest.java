package main;

public class IfTest {
	
	public void test01(){
		
		System.out.println("====== if ======");
		
		int x = 0;
		
		if(x > 0) {
			System.out.println("plus");		
		}else if(x < 0) {
			System.out.println("minus");		
		}else {
			System.out.println("zero");		
		}	
	}
	
	public void test02() {
		System.out.println("====== switch ======");
		
		int rsp = 1;
		
		switch(rsp) {
		case 1 : 
			System.out.println("가위");
			break;
		case 2 : 
			System.out.println("바위");
			break;
		case 3 : 
			System.out.println("보");
			break;
		default : System.out.println("잘못된 숫자입니다.");
		}
	}
	
}
