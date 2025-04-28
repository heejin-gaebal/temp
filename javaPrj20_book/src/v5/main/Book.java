package v5.main;

public class Book {
	
	//멤버 변수
	String title;
	String author;
	int price;
	
	//멤버 메서드 : printInfo, 반환값 x, 전달 x, 실행내용 : 모든 멤버변수 값 출력
	public void printInfo() {
		System.out.println(title + "/" + author + "/"+ price);
	}
}
