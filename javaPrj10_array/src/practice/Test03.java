package practice;

public class Test03 {

	public static void main(String[] args) {
		System.out.println("===== Test03 =====");
		
		// 정수형 변수 3개 한번에 만들기
		int[] x = new int[3];
		
		//3개 변수에 10,20,30 할당  
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		
		// 배열인덱스 이용해서 각 요소에 접근해 출력
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
	}

}
