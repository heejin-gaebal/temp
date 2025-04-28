package student;

public class main {
	public static void main(String[] args) {
		
	Student x = new Student();
	
	x.name = "박희진";
	x.studentNum = 250301;
	System.out.println(x.name);
	System.out.println(x.studentNum);
	
	x.goSchool();
	x.byeSchool();
	
	}
}
