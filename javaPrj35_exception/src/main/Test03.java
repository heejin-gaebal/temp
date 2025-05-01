package main;

public class Test03 {
	public void m01() {
		System.out.println("m01 start");
		try {
			m02();
		}catch(Exception e) {
			System.out.println("m02가 던진 예외를 m01에서 잡음");
		}
		System.out.println("m01 end");
	}

	public void m02() throws Exception {
		//예외를 원래 m02()를 호출한 m01()로 돌려보낸다. 
		System.out.println("m02 start");
		int x = 1/0;
		//throw new ArithmeticException(); 강제 예외발생 - 에러발생
		m03();
		System.out.println("m02 end");
	}

	public void m03() {
		System.out.println("m03 start");
		System.out.println("m03 end");
	}

}
