package v2.main;

public class Dog extends Animal {

	public Dog(String a, int b) {
		//부모객체 먼저 생성 
		//부모클래스 생성자에 맞게 생성자 생성
//		super("마루",3); 
		super(a,b); //Animal 의 생성자에 값이 들어감
		
		//객체를 생성하고 리턴
	}
}
