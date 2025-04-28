package practice;

public class Test02 {

	public static void main(String[] args) {
		System.out.println("===== 배열 연습2 =====");
		
		//정수 5개 저장공간 만들기
		//각 공간에 10,20,30,40,50 넣기
		//출력
		
		int[] arr = new int[5]; //배열만들기
		
		//배열의 각 칸에 접근해, 값 할당
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//배열의 각 칸에 접근해, 값 확인/출력
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}

}
