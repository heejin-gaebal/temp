package member;

public class MemberData {

	private String name;
	private int age;
	private String addr;
	private String phone;
	
	public MemberData() {
		super();
	}

	public MemberData(String name, int age, String addr, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.phone = phone;
	}

	//name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//addr
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	//phone
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "MemberData [name=" + name + ", age=" + age + ", addr=" + addr + ", phone=" + phone + "]";
	}
}
