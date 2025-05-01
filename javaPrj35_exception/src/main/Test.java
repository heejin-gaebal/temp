package main;

public class Test {

	public void m01() {
		System.out.println("m01 호출됨");
		
		try {
			String str = null;
			int result = str.length();
			System.out.println(result); //실행X
			
		}catch(NullPointerException x /*예외*/){ //Exception 타입의 x
			//예외 잡고서 다음 할일
			System.out.println("하지만 잡았죠?"); //실행O
		}catch(Exception x){ 
			//Exception 타입의 부모 모든 예외를 다 잡을 수 있음
			
		}
	}
	public void m02() {
		
		System.out.println("m02 Start");
		try {
			int x = 1/1;
			//ArithmeticException 산술, 캐스팅 또는 변환 작업에서 오류
			
		}catch(ArithmeticException x) {
			System.out.println("0으로 나누지마세오");
		}finally {
			System.out.println("finally!!");
			//예외처리 상관없이 무조건 출력됨
		}
		System.out.println("m02 End");
	}
}
