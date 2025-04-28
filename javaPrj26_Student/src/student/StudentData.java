package student;

public class StudentData {
	//manager 클래스에서 사용해야하므로 접근제한자 public 설정
	public String name;
	public int score;
	
	public void printInfo() {
		System.out.println(name +" / " + score);
	}//printInfo end
}
