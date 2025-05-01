package main;

public class Hi implements Runnable{ // - 인터페이스 상속

	@Override
	public void run() {
		System.out.println("Thread가 할 일");
		System.out.println(Thread.currentThread().getName());
	}
	
}
