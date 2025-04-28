package main;

public class ArrayTest {
	
	public void test01() {
		
		System.out.println("====== Array 1 ======");
		
		//정수형 변수 3개 한번에 만들기
		//배열변수 x 에 담기
		
		int[] x = new int[3];
		
		x[0] = 10;
		x[1] = 100;
		x[2] = 1000;
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
	}
	
	public void test02() {
		System.out.println("====== Array 2 ======");
		
		int[] a = new int[3];
		int[] b = new int[3];
		
		a[0] = 00;
		a[1] = 10;
		a[2] = 20;
		
		b[0] = 1;
		b[1] = 11;
		b[2] = 21;
		
		b=a;
		//등호를 기준으로 (왼쪽)공간 = 값 (오른쪽)
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		System.out.println("------------------------");
		
		b[1] = 777;
		System.out.println(a[1]);
	}
	
	public void test03() {
		System.out.println("====== Array 3 ======");
		
		//배열 초기화식
		int[] x = new int[] {10,20,30}; 
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
	}
	
	public void test04() {
		System.out.println("====== 2D Array (이차원 배열) 1 ======");
		
//		int[][] x = new int[3][3];
		int[][] x;
		x = new int[3][];
		x[0] = new int[3];
		x[1] = new int[3];
		x[2] = new int[3];

//		x[0] = new int[4];				x=ㅁ
//		x[1] = new int[3];			ㅁ  | ㅁ |  ㅁ
//									↓     ↓    ↓
//		x[2] = new int[1];	   ㅁㅁㅁㅁ | ㅁㅁㅁ | ㅁ
		
		
		x[0][0] = 10;
		x[0][1] = 20;
		x[0][2] = 30;

		x[1][0] = 40;
		x[1][1] = 50;
		x[1][2] = 60;

		x[2][0] = 70;
		x[2][1] = 80;
		x[2][2] = 90;
						   //행|열
		System.out.println(x[0][0]);
		System.out.println(x[0][1]);
		System.out.println(x[0][2]);
		System.out.println(x[1][0]);
		System.out.println(x[1][1]);
		System.out.println(x[1][2]);
		System.out.println(x[2][0]);
		System.out.println(x[2][1]);
		System.out.println(x[2][2]);
		
	}
	
	public void test05() {
		System.out.println("====== 2D Array (이차원 배열) 2 ======");
		
		//2차원 배열 생성(3칸짜리 배열) 3개
		// 모든 값 777
		
		int[][] x = new int[3][3];
		
		//할당
		
		int value = 10;
		for(int y=0;y<3;y++) {
			for(int i=0; i<3; i++) {
				x[y][i] = value;
				value+=10;

				/* 행과 열이 각각 바뀌어야 하므로
				 * for 문을 이중으로 만들어서 행따로 열따로 만들어줘야함
				 */
			}
		}
		
//		x[0][0] = 777;
//		x[0][1] = 777;
//		x[0][2] = 777;
//		
//		x[1][0] = 777;
//		x[1][1] = 777;
//		x[1][2] = 777;
//		
//		x[2][0] = 777;
//		x[2][1] = 777;
//		x[2][2] = 777;
		 
		//출력
		for(int a=0;a<3;a++) {
			for(int i=0; i<3; i++) {
				System.out.print(x[a][i]);			
				//" " 띄어쓰기
				System.out.print(" ");				
			}
			//엔터
			System.out.println("");	
		}
		
//		for(int i=0; i<3; i++) {
//			System.out.println(x[0][i]);
//			
//		}
//		for(int i=0; i<3; i++) {
//			System.out.println(x[1][i]);
//			
//		}
//		for(int i=0; i<3; i++) {
//			System.out.println(x[2][i]);
//			
//		}
		
//		System.out.println(x[0][1]);
//		System.out.println(x[0][2]);
//		
//		System.out.println(x[1][0]);
//		System.out.println(x[1][1]);
//		System.out.println(x[1][2]);
//		
//		System.out.println(x[2][0]);
//		System.out.println(x[2][1]);
//		System.out.println(x[2][2]);
	}
	public void test06() {
		System.out.println("====== Codeup 1460 ======");
		
		
		//3*3 2차원배열 만들기
		int n = 5; //배열값을 바꿔주면서 n*n 배열을 만들수 있음
		int[][] x = new int[n][n];
		int y = 1;
		
		//각 칸에 1~9 순서대로 채우기
		for(int i=0; i<n; i++) {	//0~n 까지
			for(int j=0; j<n; j++) {
				x[i][j] = y++; //값 증가를 위해 y 변수 추가해줌
			}
		}
		
		//모든 값 출력
		for(int a=0; a<n; a++) {	//0~n 까지
			for(int b=0; b<n; b++) {
				System.out.print(x[a][b]);				
				System.out.print(" ");				
			}
			System.out.println("");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
