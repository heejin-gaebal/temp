package main;

public class Test02 {
	public void m01() {
		System.out.println("m01 start");
		m02();
		System.out.println("m01 end");
	}

	public void m02() {
		System.out.println("m02 start");
		try {
			int x = 1/0;
		}catch(Exception x) {
			System.out.println("0으로 나누지 마세옹");
			m03();
			System.out.println("m02 end");
		}
	}

	public void m03() {
		System.out.println("m03 start");
		System.out.println("m03 end");
	}

}
