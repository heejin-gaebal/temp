package kh.stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		System.out.println("====== Stack ======");
		
		//first in last out
		//last in first out
		
		Stack x = new Stack();
		
		x.push("하나");
		x.push("둘");
		x.push("셋");
		
		System.out.println(x);
		
		System.out.println(x.pop());
		
		System.out.println(x);
		//마지막에 들어간 것이 먼저 나옴
	}

}
