package practice;

public class Main {

	public static int num = 0;
	
	public static void main(String[] args) {

		//클래스 상속 간단식
//		new MsgSenderThread().start();
//		new MsgRecvThread().start();
//		
//		new ImgSenderThread().start();
//		new VideoSenderThread().start();
//
//		
//		new PlusThread().start();
//		new MinusThread().start();

		new Increament().start();
		new PrintThread().start();
		//멀티 쓰레드 사용시 공유되는 값 주의해서 써야함
		//static 의 공유자원을 또 다른 쓰레드가 변경할 위험이 있음
	}

}
