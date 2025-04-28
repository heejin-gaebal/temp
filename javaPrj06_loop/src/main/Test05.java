package main;

public class Test05 {

	public static void main(String[] args) {
		//1~10출력
		
		int cnt = 1;
		while(cnt <= 10) {
			System.out.println(cnt++);
		}
		
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		
		int plus = 1;
		do{
			System.out.println(plus++);
		}
		//출력 후 증가
		//plus++ 이곳에 위치하는 것과 같다
		while(plus <= 10);
		
	}

}
