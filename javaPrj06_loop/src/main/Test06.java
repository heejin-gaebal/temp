package main;

public class Test06 {

	public static void main(String[] args) {
	
		System.out.println("===== 구구단 =====");
		
		//구구단 출력
		
		for(int dan=2; dan<=9; dan++) {
			for(int x = 1; x<=9; x++) {
				System.out.println(dan + "*" + x + "=" + dan*x);			
			}
		}
	}
}
