package main;

public class Test04 {

	public static void main(String[] args) {
		
		// 1~10 출력 (반복문)
		// 홀수만 출력 
		
//		int x = 1;
//		while(x <= 10) {
//			System.out.println(x);
//			x++;
//		}
		
		for(int x = 1; x <= 10; x++) {
			if(x % 2 != 1) { //x 를 2로 나눴을 때 1이 아니면 
				continue;	 //반복문 처음으로 돌아가라
			}
			System.out.println(x);				
		}
			
	}

}
