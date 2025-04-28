package main;

public class Main {

	public static void main(String[] args) {

		System.out.println("======= 상속 =======");
//		
//		Student s = new Student();
//		s.studentNumber = "123456";
//		s.score = 87;
//		s.name= "키키";
//		s.age= 20;
//		s.hello();
//		
//		Person p = new Person();
//		p.name ="";
//		p.age = 0;
		
		//정적 바인딩 : 코드 타이핑한 상태
		//동적 바인딩 : 해당 코드 "실행"된 상태
		
		//generate
		Animal dog; 
		dog = new Dog(); // 실행버튼 눌러야 실행 - 실행하기 전에는 보이지않는다
		
		System.out.println(dog.a);	//여기의 dog 는 부모의 animal 
		//System.out.println(dog.b);	
		//정적바인딩 : Animal 에는 b 없으므로 없다고 판단 | 동적바인딩 : 실행이 되어봐야 안다

		//Animal dog = new Dog(); //문제없음!
		Cat cat = new Cat();
		Bird bird = new Bird();
		Mouse mouse = new Mouse();
		
		dog.cry();	
		//Animal 에 추상메서드 있고, 정적바인딩 상태 : 이상없음
		
		//set data
		dog.name ="뭉뭉이";
		dog.age = 3;
		cat.name ="우주";
		cat.age = 4;
		bird.name ="짹이";
		bird.age = 5;
		mouse.name ="제리";
		mouse.age = 2;
		
		//print
		System.out.println(dog);
		System.out.println(cat);
		System.out.println(bird);
		System.out.println(mouse);
		
		dog.cry();
		cat.cry();
		bird.cry();
		mouse.cry();
	}
}
