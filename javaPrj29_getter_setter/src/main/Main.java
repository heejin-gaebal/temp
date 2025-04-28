package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("====== getter / setter ======");
		
		Person p = new Person();
		p.setName("hardy");
		p.setAge(25);
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		String str = p.getInfo();
		System.out.println(str);
		
		System.out.println("------------------------------------------------");
		
		Student student = new Student();

		student.setName("Odery");
		student.setScore(100);
		student.setGrade('A');
		student.setisStudy(true);
		student.setHeight(155.1);
		student.setWeight(42.2);
		
		System.out.println(student.getName());
		System.out.println(student.getScore());
		System.out.println(student.getGrade());
		System.out.println(student.getisStudy());
		System.out.println(student.getHeight());
		System.out.println(student.getWeight());

		System.out.println("------------------------------------------------");
		
		Pokemon pmon = new Pokemon();
		pmon.setName("pikachu");
		pmon.setHp(120);
		pmon.setAtk(30);
		
		System.out.println(pmon.getName());
		System.out.println(pmon.getHp());
		System.out.println(pmon.getAtk());
		
		System.out.println("------------------------------------------------");
		
		Animal animal = new Animal();
		animal.setName("티거");
		animal.setAge(14);
		animal.setType("호랑이");
		
		System.out.println(animal.getName());
		System.out.println(animal.getAge());
		System.out.println(animal.getType());
		
		System.out.println("------------------------------------------------");
		
		Member member = new Member();
		member.setId("박회원");
		member.setPwd("qhdks123");
		member.setNick("lucky");
		member.setAddress("서울 강남구 서초동");
		member.setMbti("ENFP");
		member.setBlood('A');
		member.setAge(20);
		member.setWeight(180.5);
		member.setHeight(83.5);
		member.setGender('M');
		
		System.out.println(member.getId());
		System.out.println(member.getPwd());
		System.out.println(member.getNick());
		System.out.println(member.getAddress());
		System.out.println(member.getMbti());
		System.out.println(member.getBlood());
		System.out.println(member.getAge());
		System.out.println(member.getWeight());
		System.out.println(member.getHeight());
		System.out.println(member.getGender());
		
		System.out.println("------------------------------------------------");
		
		Snack snack = new Snack();
		snack.setName("홈런볼");
		snack.setPrice(2800);
		
		String x = snack.getInfo();
		System.out.println(x);
		
		System.out.println("------------------------------------------------");
		
		Phone phone = new Phone();
		phone.setName("iphone15");
		phone.setPrice(500);
		
		String y = phone.getInfo();
		System.out.println(y);
		
		System.out.println("------------------------------------------------");
		
		Pet pet = new Pet();
		pet.setName("야옹이");
		pet.setAge(5);
		
		String petinfo = pet.getInfo();
		System.out.println(petinfo);

		System.out.println("------------------------------------------------");
		
		Car car = new Car();
		car.setName("ferrari");
		car.setPrice(500);
		
		car.getInfo();
		System.out.println(car.getInfo());

		System.out.println("------------------------------------------------");
		
		Fruit fruit = new Fruit("오렌지",3000); //생성자에 파라미터 넣어주기
//		fruit.setName("오렌지");
//		fruit.setPrice(3000);
		
		System.out.println(fruit.getInfo());

		System.out.println("------------------------------------------------");
		
		Drink d = new Drink("아메리카노", 1500);
		System.out.println(d.toString());

		System.out.println("------------------------------------------------");
		
		Food f = new Food("햄버거", 10);
		System.out.println(f);
		
		System.out.println("------------------------------------------------");
		
		Computer com = new Computer("cpu", 1, 2, 3, 4, "mainBoard", true);
		System.out.println(com);
		
		System.out.println("------------------------------------------------");
		
		Book b = new Book("춘향전", 5000);
		System.out.println(b);
		
		System.out.println("------------------------------------------------");
		
		Cartoon cT = new Cartoon("원피스", 4500);
		System.out.println(cT);
	}

}
