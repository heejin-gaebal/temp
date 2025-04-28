package pratice;

public class Main {

	public static void main(String[] args) {

		System.out.println("====== 생성자 오버로딩 ======");
		
		Person p = new Person("james", 34);
		
		System.out.println(p.name);
		System.out.println(p.age);
		
		Person p2 = new Person();
		p2.name="";
		p2.age=10;
	}

}
