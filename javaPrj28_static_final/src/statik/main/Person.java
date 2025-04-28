package statik.main;

public class Person {
	
	//필드 추가
	public static String name; //static 메모리로 이동
	public int age;
	
	public static void printInfo() {
//		System.out.println(name + " | " + age); 
		//에러 : age는 static이 아니라서, 참조불가.
		//Non static 필드를 static 메서드에서 참조할 수 없음
	}
}
/*
 * 스태틱 메서드가 실행처음부터 구현이 되어 
 * 후에 작성된 멤버변수를 스태틱 메서드가 찾아가지못한다.
 *  
 *  어떤 변수도 메서드를 찾아가진 못함.
 *  멤버메서드는 스태틱메서드를 호출할 수 있다.
 *   
 */