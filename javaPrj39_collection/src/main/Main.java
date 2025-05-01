package main;

import java.util.ArrayList;

import kh.util.GoodAray;

public class Main {

	public static void main(String[] args) {
		System.out.println("====== collection ======");
		
		ArrayList x = new ArrayList();
		x.add(100);
		x.add(200);
		x.add(300);
		System.out.println(x);
		
		x.remove(1);
		System.out.println(x);
		
		System.out.println(x.get(0));
		
		x.clear();
		System.out.println(x);
		
//		GoodAray x = new GoodAray();
//		x.add(100);
//		x.add(200);
//		x.add(300);
//		x.printArray();
//		
//		x.delete(1);
//		x.printArray();
//		
//		System.out.println(x.getValue(0));
	}

}
