package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("====== Thread ======");
//
//		System.out.println(Thread.currentThread().getName()); //간단식
//		//thread 의 이름 호출하기
//		
//		Thread t1 = Thread.currentThread();
//		String t1Name = t1.getName();
//		System.out.println(t1Name);
		
		/*
		 * Thread 생성 방법
		 * 
		 * - 클래스 상속
		 * - 인터페이스 상속
		 * - 람다식
		 * 
		 * thread 에게 할일을 주는 것이 중요 
		 * 	-> run()메서드에 준다
		 */

//		System.out.println("------------ 클래스 상속 ------------"); 
//		Hello a = new Hello();
//		a.start();	//thread 에게 run 호출하게 함
//		
//		System.out.println("Thread 이름 : " + a.getName()); 

//		System.out.println("------------ 인터페이스 상속 ------------");
//		Hi y = new Hi();
////		y.start(); Thread 아니고 start 없어서 못함
//	  //그러므로  Runnable 상속받음
//		Thread z = new Thread(y);
////  	Thread 타입의 z에 새 객체 y 할당
//		z.start(); 
		
//		System.out.println("------------ 람다식 ------------");
//			//객체, runnable 생략하고 기호로 표기 
//		Thread z = new Thread(()->{{ 
//			System.out.println("tread 람다식");
//			}
//		});
//		z.start(); 
		
//		System.out.println("------------ 익명클래스 ------------"); 
//		새로운 클래스 없이[익명클래스] Runnable 객체를 thread 에 바로 전달하는 법
//		Runnable x = new Runnable() {
//			public void run() {
//				System.out.println("tread 익명클래스");
//			}
//		};
//		new Thread(x).start();
//
//		System.out.println("------------ 익명클래스 람다식 ------------");
//		
//		Runnable x = () -> {
//			System.out.println("tread 익명클래스 람다식");
//		};
//		new Thread(x).start();
		
		System.out.println("------------ 인터페이스 상속연습 ------------");
		System.out.println("-- PrintHelloRunner / PrintHiRunner --");
		
		//간단식
		PrintHelloRunner hello = new PrintHelloRunner();
		new Thread(hello).start();
		
		PrintHiRunner hi = new PrintHiRunner();
		new Thread(hi).start();
	}

}
