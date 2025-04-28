package finar.main;

public class fest {
	final int x = 10;

	public void m01() {
//		x = 20; //에러발생 : final은 한번만 할당가능하고 재할당은 불가능
		System.out.println(x);
	}
	
}
