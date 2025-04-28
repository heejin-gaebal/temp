package main;

public class Ghibri {
	private String name;
	private String made;
	private String birth;
	
	public Ghibri(String name, String made, String birth) {
		this.name = name;
		this.made = made;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getMade() {
		return made;
	}
	public void setMade(String made) {
		this.made = made;
	}

	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String toString() {
		return "Ghibri [name=" + name + ", made=" + made + ", birth=" + birth + "]";
	}
	
	
	
	
}
