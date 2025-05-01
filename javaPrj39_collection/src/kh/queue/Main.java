package kh.queue;

import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("====== Queue ======");
		
		//first in first out 선입선출
		PriorityQueue x = new PriorityQueue();
		
		x.offer("aaa");
		x.offer("bbb");
		System.out.println(x);
		
		System.out.println(x.poll());
		//처음에 들어간 것이 먼저 나옴

		System.out.println(x);
	}

}
