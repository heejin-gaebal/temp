package practice.main;

public abstract class Animal {

	private String name;
	private int age;

	public Animal() { //기본생성자
		super(); //Animal 의 부모객체 생성하기위함
	}

	public Animal(String name, int age) { //파라미터받는 생성자
		super(); //부모 먼저 태어나기
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	
}
