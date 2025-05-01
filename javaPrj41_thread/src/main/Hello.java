package main;

public class Hello extends Thread{ //thread 로 태어나라 - 클래스 상속

	//thread 에게 일을 시작하는 명령
	@Override 
	public void run() {
		System.out.println("헬로 쓰레드 스타트!");
		
		System.out.println(Thread.currentThread().getName());
	}
}
